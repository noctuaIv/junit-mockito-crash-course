package com.voytovych.maven.calculator.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void addSouldReturnResult() {
		Calculator c = new CalculatorImpl();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
