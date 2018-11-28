package com.java.ThreadExample;

public class ThreadFirst {

	
	
	public static void main(String[] args) {
		
		
		Task t1=new Task();
		t1.start();
		System.out.println("rebhu");
		
		Task t2=new Task();
		t2.start();
		System.out.println("rebhu1");

	}

}

class Task extends  Thread{

	public void run() {
		for(int i=0;i<5000;i++)
			System.out.println("i: "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}