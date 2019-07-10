package com.example.TeamCalculator;

public class Addition implements Arithmetic {

	public Arithmetic evaluate(double arg1, double arg2) {
		System.out.println("Addition = " +(arg1+arg2));
		return new Addition();
	}
	

}
