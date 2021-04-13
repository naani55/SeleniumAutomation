package javaprogs;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a=10,b=20;
		
		System.out.println("before swap a and b values "+a+" "+b );
		
		/*
		 * int temp; temp = a; a = b ; b = temp;
		 */
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("before swap a and b values "+a+" "+b );
		
		
	}

}
