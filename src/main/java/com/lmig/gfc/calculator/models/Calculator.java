package com.lmig.gfc.calculator.models;

public class Calculator {

	private String operator;
	private int firstNumber;
	private int secondNumber;
	private double results;
	private String list;

	public Calculator(int firstNumber, int secondNumber, String operator) {

		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;

	}

	public String getString() {
		list = firstNumber + " " + operator + " " + secondNumber + " = " + results;
		return list;
		
	}
	
	public void doMath() {
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

	}

	public void add() {
		results = firstNumber + secondNumber;
	}

	public void minus() {
		results = firstNumber - secondNumber;
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

	public double getResults() {
		return results;
	}

}
