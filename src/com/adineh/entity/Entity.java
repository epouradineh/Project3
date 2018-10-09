package com.adineh.entity;

import com.adineh.exceptions.BadEntityException;

public interface Entity {
	Integer getID();

	void readFromConsole() throws BadEntityException;

	void showOnConsole();
}
