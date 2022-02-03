package com.psk;

public class CalcApplication {
public CalculatorService calcService;
public void setCalculatorService(CalculatorService calcService1)
{
	this.calcService=calcService1;
}
public double add (double a1, double a2)
{
	return calcService.add(a1, a2);
}
public double sub (double a1, double a2)
{
	return calcService.sub(a1, a2);
}
public double mul (double a1, double a2)
{
	return calcService.mul(a1, a2);
}
public double div (double a1, double a2)
{
	return calcService.div(a1, a2);
}
}
