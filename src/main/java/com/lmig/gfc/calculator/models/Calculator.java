package com.lmig.gfc.calculator.models;

public class Calculator {

	private String operator;
	private int firstNumber;
	private int secondNumber;
	private double results;

	public Calculator(int firstNumber, int secondNumber, String operator) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;
	}

	public double doMath() {
		if (operator.equals("+")) {
			results = firstNumber + secondNumber;
		}
		if (operator.equals("-")) {
			results = firstNumber - secondNumber;
		}
		if (operator.equals("*")) {
			results = firstNumber * secondNumber;
		}
		if (operator.equals("/")) {
			results = firstNumber / secondNumber;
		}
		if (operator.equals("^")) {
			results = Math.pow(firstNumber, secondNumber);
		}
		return results;

	}

	public String getOperator() {
		return operator;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}
