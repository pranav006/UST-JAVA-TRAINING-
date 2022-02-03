package com.psk.ust.A1;

public class DemoThread implements Runnable {
	Thread t;
	DemoThread(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " + t);
		t.getName();
	}
	
	public void run() {
		try {
			for(int i =5;i>0;i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}
