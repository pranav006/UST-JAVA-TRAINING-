package com.psk.ust.A1;

public class MyException extends Exception {
	private static int[] accNo = {101,102,103,104,105};
	private static String[] name = {"p","q","r","s","t"} ;
	private static double balance[]= {10000.00,12000.00,15000.00,700.00,3000.00};
	MyException()
	{
		
	}
	MyException (String str)
	{
		super(str);
	}
	public static void main(String[] args)
	{
	System.out.println("Accno"+"\t"+"Customer name"+"\t"+"Balance");
	try {
	for(int i =0;i<5;i++)
	{
		if(balance[i]<1000)
		{
			MyException me = new MyException("Bal below 1000 ");
			throw me;
		}
		System.out.println(accNo[i]+"\t\t"+name[i]+"\t"+balance[i]);
	}
	}
	catch(MyException me)
	{
		me.printStackTrace();
	}finally {
	System.out.print("Finally-Bye");}
	}
}
