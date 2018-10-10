package com.adineh.service;

import com.adineh.entity.Book;
import com.adineh.entity.Entity;
import com.adineh.entity.Member;
import com.adineh.exceptions.EntityNotFoundException;

interface Library {
	void save(Entity entity);

	void update(Entity e) throws EntityNotFoundException;

	void delete(Entity e) throws EntityNotFoundException;

	Entity[] find(Entity example);

	void borrow(Member member, Book book);

	void giveBack(Member member, Book book);
}
