package com.java.ThreadExample;

public class ThreadSecond {

	
	
	public static void main(String[] args) {
		
		System.out.println("Thread 1 is going to start");
		Task t1=new Task("My First Thread");
		t1.start();
		
		System.out.println("Thread 2is going to start");

		Task t2=new Task("My second Thread");
		t2.start();
		
	}

}

class Task extends  Thread{
  String name;
  
	 public Task(String s){
		 this.name=s;
	 }
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++)
			System.out.println("i: "+i+"  "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}