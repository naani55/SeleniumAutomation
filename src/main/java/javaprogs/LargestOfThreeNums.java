package javaprogs;

public class LargestOfThreeNums {

	public static void main(String[] args) 
	{
		int a = 500,b=200,c=300;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>c)
		{
			System.out.println("b is largest");
		}
		else
			System.out.println("c is largest");
	}

}
