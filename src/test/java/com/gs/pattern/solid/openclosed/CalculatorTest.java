package com.gs.pattern.solid.openclosed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static final int VALUE1 = 10;
	private static final int VALUE2 = 5;
	
	private Calculator calculator;
	
	@BeforeEach
	public void setup() {
		System.out.println("(Re)Setting up calculator ");
		calculator = new Calculator();
	}
	
	@Test
	public void additionTest() throws IllegalAccessException {
		Addition addition = new Addition(VALUE1, VALUE2);
		calculator.calculate(addition);
		assertEquals(15, addition.getResult());
	}
	
	@Test
	public void subractionTest() throws IllegalAccessException {
		Subtraction addition = new Subtraction(VALUE1, VALUE2);
		calculator.calculate(addition);
		assertEquals(5, addition.getResult());
	}
	
}
