package com.lmig.gfc.calculator.models;

public class Calculator {
	
	private String operator;
	private int firstNumber;
	private int secondNumber;
	private int results;
	
	public Calculator(int firstNumber, int secondNumber, String operator) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.operator = operator;
	}
	
	public int doMathAdd() {
		results = firstNumber + secondNumber;
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
