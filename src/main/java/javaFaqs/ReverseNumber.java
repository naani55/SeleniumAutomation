package javaFaqs;

import java.util.Scanner;

public class ReverseNumber {

	public void reverseLogic()
	{
		System.out.println("Enter a number :  ");

		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();

		int rev = 0;

		while(num!=0)
		{
			rev  = rev*10 + num%10;
			num = num/10;

		}

		System.out.println("reverse number is : "+rev);
		
		s.close();

	}
	
	public void reverseSb()
	{
		System.out.println("Enter a number :  ");

		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev  = sb.reverse();
		
		System.out.println("reverse number is : "+rev);
		
		s.close();
	}
	
	public void reverseSbl()
	{
		System.out.println("Enter a number :  ");

		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
		
		System.out.println("reverse number is : "+rev);
		
		s.close();
	}



	public static void main(String[] args) 
	{
		ReverseNumber rn  = new ReverseNumber();
		rn.reverseSbl();
		
	}


}
