package com.gs.pattern.solid.openclosed;

public class CalculatorDemo {

	public static void main(String[] args) throws IllegalAccessException {
		Calculator calculator = new Calculator();
		Addition addition = new Addition(2, 3);
		calculator.calculate(addition);
		System.out.println(addition.getResult());
		
		Subtraction subtraction = new Subtraction(5, 3);
		calculator.calculate(subtraction);
		System.out.println(subtraction.getResult());
	}

}
