package com.testyantra.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathOppTest {

	MathOpp m = new MathOpp();

	@Test
	public void addMethodTest() {
		assertEquals(89, m.add(10, 79));

	}

	@Test
	public void divMethodTest() {
		assertEquals(10, m.div(50, 5));

	}

	@Test(expected = ArithmeticException.class)
	public void divMethodForException() {
		m.div(10, 0);
	}
}
