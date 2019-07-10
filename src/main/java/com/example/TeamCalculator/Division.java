package com.example.TeamCalculator;

public class Division implements Arithmetic{
	public Arithmetic evaluate(double arg1,double arg2) {
		System.out.println("result is:"+(arg1/arg2));
		return new Division();
	}

}
