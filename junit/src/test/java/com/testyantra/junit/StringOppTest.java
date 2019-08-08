package com.testyantra.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringOppTest {

	private StringOpp s = new StringOpp();

	@Test
	public void teststringOpp() {

		int actual = s.count("hello");
		int expected = 5;

		assertEquals(expected, actual);
	}

	@Test(expected = NullPointerException.class)
	public void teststringOppForException() {
		s.count(null);

	}

}
