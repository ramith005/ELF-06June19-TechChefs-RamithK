package com.testyantra.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BooleanOppTest {

	private BooleanOpp b = new BooleanOpp();

	@Test
	public void test() {
		assertEquals(true, b.even(4));
	}

}
