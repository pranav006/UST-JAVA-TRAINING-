package com.psk.ust.A1;

import java.util.Scanner;

public class HollowDiamond {

	 public static void main (String[] args)
	 {
	 	int i, j,num;
	 	
	 	Scanner c = new Scanner(System.in);
	 	
	 	System.out.print("Enter the number = ");
	 	 num = c.nextInt();
	 	 
	 	 System.out.println("The pattern is\n ");
	 	 
	 	 for(i=1;i<=num;i++) 
	 		{ 
	 			for(j=num-i;j>0;j--) 
	 			{
	 				System.out.print(" ");
	 			}
	 			
	 			for(j=0;j<((2*i)-1);j++)
	 			{
	 				if(j==((i-1)*2) || j==0) {
	 					System.out.print("*");}
	 				else
	 					System.out.print(" ");
	 				
	 			}
	 			System.out.println(); 
	 			
	 		}
	 	
	 		
	 	for(i=num-1;i>=1;i--)
	 	{
	 		for(j=0;j<num-i;j++)
	 		{
	 			System.out.print(" ");
	 		}
	 		for(j=0;j<(2*i)-1;j++)
	 		{
	 			if(j==((2*i)-2) || j==0) {
 					System.out.print("*");}
 				else
 					System.out.print(" ");
	 		}
	 		System.out.println(); 
	 		}
	 	c.close();
	 }
}
