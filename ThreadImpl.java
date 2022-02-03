package com.psk.ust.A1;


public class ThreadImpl { // this method demonstrates how to invoke a thread

	public static void main(String[] args) {
		new DemoThread();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}
