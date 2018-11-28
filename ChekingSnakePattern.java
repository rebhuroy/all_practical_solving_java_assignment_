package com.project.snake;

public class ChekingSnakePattern {

	/*
	 * @param args
	 */
	public static void fun(int r,int c,int a[][]){
		int sr=0,endr=r-1;
		int sc=0,endc=c-1;
		//while(sr<endr && sc<endc){
			for(int i=sr;i<endr;i++){
				System.out.print(a[sr][i]);
		}
			sr++;
			for(int i=sr;i<endr;i++){
				System.out.print(a[sr][i]);
		}
			
		}
	
	
	
	public static void main(String[] args) { 
		int [][]a=new int[][]{
				{1, 2, 3,4,1}, 
				{7, 8, 9,0,6}, 
				{13, 14,11, 15,10} ,
		    	{3, 14, 5,7,1} ,
		    		{13, 14,11, 15,10} 
		};

		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++)
				System.out.print("["+i+" "+j+"]");
			System.out.println();

		}
		int r=5;
		int c=5;
		System.out.println("\n\n");
		fun(r,c,a);

//		for(int i=0;i<4;i++){
//			if(c%2==0)
//			for(int j=0;j<4;j++){
//				System.out.print("["+i+" "+j+"]");
//				System.out.println();
//			}
//			c++;
//			
//		}
		
	}
	
	
	

}
