package com.gs.pattern.solid.openclosed;

public class Calculator {
	
	public void calculate(CalculatorOperation operation) throws IllegalAccessException {
		
		if(operation == null) {
			throw new IllegalAccessException("Operation can not be null");
		}
		
		operation.perform();
	}
}
