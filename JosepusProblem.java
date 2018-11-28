package com.project.snake;

//Java program to find solution of Josephus 
//problem when size of step is 2. 
import java.io.*; 


public class JosepusProblem { 
	
	// Returns position of survivor among 
	// a circle of n persons and every 
	// second person being killed 
	static int josephus(int n,int k) 
	{ 
		
		if(n==1)
			return 0;
		else
			return (josephus(n-1,k)+k)%n;
	} 

	// Driver Program to test above function 
	public static void main(String[] args) 
	{ 
		int n = 16; 
		
		System.out.println("The chosen place is "
								+ josephus(7,3)); 
	} 
} 

//This Code is Contributed by Anuj_67 
