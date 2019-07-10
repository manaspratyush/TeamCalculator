package com.example.TeamCalculator;

public class Subtraction implements Arithmetic {

	public Arithmetic evaluate(double arg1, double arg2) {
		System.out.println("Subtraction = " +(arg1-arg2));
		return new Subtraction();
	}

}
