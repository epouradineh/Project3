package com.adineh.entity;

import com.adineh.app.Application;
import com.adineh.exceptions.BadEntityException;

public class Member extends Person {

	private String name;
	private int age;
	private Gender gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public Integer getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readFromConsole() throws BadEntityException {
		Member newMember = new Member();
		newMember.setName(Application.inScan.next());
		newMember.setAge(Application.inScan.nextInt());
		newMember.setGender(getGender(Application.inScan.next().charAt(0)));


	}

	@Override
	public void showOnConsole() {
		// TODO Auto-generated method stub

	}
	
	private Gender getGender(char c) {
		if(c=='m')
			return Gender.Male;
		else
			return Gender.Female;
	}

}
