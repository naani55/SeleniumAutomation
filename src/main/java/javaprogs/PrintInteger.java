package javaprogs;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("please enter a number");
		
		int n = s.nextInt();
		
		System.out.println("entered number");
		
		System.out.println(n);
	}

}
