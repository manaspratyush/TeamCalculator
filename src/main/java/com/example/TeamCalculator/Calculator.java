package com.example.TeamCalculator;

import java.util.Stack;

public class Calculator {
public void evaluateexp(String operator,double a,double b)
{
	switch(operator)
	{
	case "+":Addition ad=new Addition();
	         ad.evaluate(double a,double b);
	case "-":Substraction su=new Substraction();
             su.evaluate(double a,double b);
	case "*":Multiplication mu=new Multiplication();
             mu.evaluate(double a,double b);
	case "/":Division di=new Division();
             di.evaluate(double a,double b);
	}

	
}
public static void main()
{
	Calculator calculator=new Calculator();
	calculator.evaluateexp("+",2,8);
}
}
