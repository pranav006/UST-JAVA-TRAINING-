package com.psk.ust.A1;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {int n,k;
		Scanner c =  new Scanner(System.in);
		System.out.print("Enter the array size : ");
		n=c.nextInt();
		int A[] = new int[n];
		System.out.print("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			A[i]=c.nextInt();
		}
		ArraySort a = new ArraySort();
		a.sort(A,0,n-1);
		
		System.out.print("Enter the value of k = ");
		k=c.nextInt();
		System.out.print(k+"th"+" smallest and largest elements are " + A[k-1]+" and "+ A[(n-k)] + " respectively.");		
c.close();
	}

}
