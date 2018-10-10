package com.adineh.entity;

import com.adineh.app.Application;
import com.adineh.app.CheckCoreectInputs;
import com.adineh.exceptions.BadEntityException;
import com.adineh.service.LibraryImp;

public class Member extends Person implements CheckCoreectInputs {
	
	public Member() {
		
	}

	public Member(String name, Integer age, Gender gender) {
		super(name, age, gender);
	}

	private static Integer id = 10000;
	private LibraryImp libraryImp;
	
	
	
	@Override
	public Integer getID() {
		return id;
	}

	@Override
	public void readFromConsole() throws BadEntityException {
		Member newMember = new Member();
		newMember.id = id;
		System.out.println("Enter Member Name: ");
		newMember.setName(Application.inScan.next());
		System.out.println("Enter Member Age: ");
		newMember.setAge(correctIntegerReturn(Application.inScan));
		System.out.println("Enter Member Gender \t***'Select m for Male and f for Female'***: ");
		newMember.setGender(getGender(correctGenderSelectionReturn(Application.inScan)));
		if(newMember instanceof Person) {
			id++;
			libraryImp.save(newMember);
		}else throw new BadEntityException();
	}

	@Override
	public void showOnConsole() {
		// TODO Auto-generated method stub

	}

	private Gender getGender(char c) {
		if (c == 'm')
			return Gender.Male;
		else
			return Gender.Female;
	}

}
