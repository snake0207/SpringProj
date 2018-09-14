package com.acro.spring;

public class MyCalcClass {
	private CalcClass calc;
	private int firstNum;
	private int secondNum;

	public void setCalc(CalcClass calc) {
		this.calc = calc;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		calc.add(firstNum, secondNum);
	}
	public void sub() {
		calc.sub(firstNum, secondNum);
	}
}
