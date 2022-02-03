package com.psk.ust.A1;

import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {int row,col,i,j;
Scanner c = new Scanner(System.in);
System.out.print("Enter the rows and columns respectively : ");
row=c.nextInt();
col=c.nextInt();
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
		System.out.print("*");
	System.out.println();
}
c.close();
}
}