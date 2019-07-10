package com.example.TeamCalculator;

public class Multiplication implements Arithmetic{
	public Arithmetic evaluate(double arg1, double arg2)
	{
		System.out.println("result is:"+(arg1*arg2));
		return new Multiplication();
	}

}
