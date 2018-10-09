package com.adineh.app;

import com.adineh.entity.Book;
import com.adineh.entity.Entity;
import com.adineh.entity.Member;
import com.adineh.exceptions.EntityNotFoundException;

public class LibraryImp implements Library {

	@Override
	public void save(Entity entity) {
		
	}

	@Override
	public void update(Entity e) throws EntityNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Entity e) throws EntityNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public Entity[] find(Entity example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrow(Member member, Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void giveBack(Member member, Book book) {
		// TODO Auto-generated method stub

	}

}
