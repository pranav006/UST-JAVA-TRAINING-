package com.psk.ust.A1;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args)
	{	int i=0,j,num,k=1;
		Scanner c = new Scanner(System.in);
		System.out.print("Enter the range = ");
		num = c.nextInt();
		int Array[][] = new int [num][num];
		for(i=0;i<num;i++) {
			if(i%2==0)
			{for(j=0;j<num;j++)
			{Array[i][j]=k++ ;}
				k=k+num-1;}
		else {for(j=0;j<num;j++)
			{Array[i][j]= (k--) ;}
		       k=k+num+1;}}	
	   for(i=0;i<num;i++)
	   {
		   for(j=0;j<num;j++)
		   {
			   System.out.print(Array[i][j] + " ");
		   }System.out.println();
	   }
c.close();
}}
