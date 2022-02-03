package com.psk.ust.A1;


class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n + "*"+i+"="+ n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.print("Exception "+e);
			}
		}
	}
}
//class MyThread1 extends Thread{
//	Table t;
//	MyThread1(Table t1){
//		this.t=t1;
//	}
//	public void run()
//{
//		t.printTable(5);
//}}
//class MyThread2 extends Thread
//{
//	Table t;
//	MyThread2(Table tab1)
//	{
//		this.t=tab1;
//	}
//	public void run()
//	{
//		t.printTable(100);
//	}
//}
public class MySync {

	public static void main(String[] args) {
	
Table obj=new Table();
//MyThread1 t1 = new MyThread1(obj);
//MyThread2 t2 = new MyThread2(obj);
Thread t1=new Thread()
	{
		public void run()
		{
			obj.printTable(6);
		}
	};

Thread t2 =new Thread()
{
	public void run()
	{
		obj.printTable(200);
	}
};
t1.start();
t2.start();

	}

}
