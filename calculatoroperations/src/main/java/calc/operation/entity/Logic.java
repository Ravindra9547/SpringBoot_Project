package calc.operation.entity;

import java.math.BigDecimal;

//this class is responsible for all the arithmetic operations
public class Logic {

	public static double add(double num1,double num2)
	{
		return num1+num2;
	}
	public static double sub(double num1,double num2)
	{
		return num1-num2;
	}
	public static double multi(double num1,double num2)
	{
		return num1*num2;
	}
	public static double div(double num1,double num2) throws ArithmeticException
	{
		if (num2==0)
		{
			throw new ArithmeticException("Cannot divide by zero");
		}
        return num1/num2;
	}
}
