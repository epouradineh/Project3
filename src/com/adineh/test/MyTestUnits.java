package com.adineh.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adineh.entity.Gender;
import com.adineh.entity.Member;
import com.adineh.exceptions.BadEntityException;

public class MyTestUnits {

	@Test
	public void testEntityFromConsol() throws BadEntityException {
		Member membertestBase = new Member("Ebi",36,Gender.Male);
		Member menbertestTest = new Member();
		menbertestTest.readFromConsole();
		assertEquals(membertestBase, menbertestTest);
	}
}
