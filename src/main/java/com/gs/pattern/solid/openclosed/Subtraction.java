package com.gs.pattern.solid.openclosed;

public class Subtraction implements CalculatorOperation{

	private int value1;
	private int value2;
	private int result;

	public Subtraction(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getResult() {
		return result;
	}

	@Override
	public void perform() {
		result = this.value1 - this.value2;
	}


}
