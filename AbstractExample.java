package defaultPorject;

public abstract class AbstractExample {
 
	 abstract void s();
	 abstract void s1();	
}

class Ex extends AbstractExample{
	 void s(){
	System.out.println("s is calld");	
	}
	 void s1(){
		System.out.println("s1 is calld");	
	
	}
	
public static void main(String args){
	Ex e=new Ex();
	e.s();
	e.s1();
		
	}
	
}




