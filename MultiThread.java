package com.psk.ust.A1;

public class MultiThread extends Thread {
public void run()
{try {
	System.out.println("Thread "+Thread.currentThread().getId()+" is running");}
catch (Exception e)
{
	System.out.println("Exception "+e);
}
}
	public static void main(String[] args) {
		
int n=20;
for(int i=0;i<n;i++)
{
	MultiThread ThreadObj = new MultiThread();
	ThreadObj.start();
}
	}

}
