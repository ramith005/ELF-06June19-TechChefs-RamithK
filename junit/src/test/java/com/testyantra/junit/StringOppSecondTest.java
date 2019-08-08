package com.testyantra.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RunWith(Parameterized.class)
public class StringOppSecondTest {

	private static StringOpp str = new StringOpp();

	private String name;
	private int val;

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "apple", 5 }, { "mango", 5 }, { "grapes", 6 } };

		return Arrays.asList(obj);

	}

	@Test
	public void testCountofString() {
		int res = str.count(name);
		assertEquals(val, res);

	}

}
