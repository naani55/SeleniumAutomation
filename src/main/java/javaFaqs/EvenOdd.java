package javaFaqs;

public class EvenOdd {

	public static void main(String[] args) 
	{
		int[] a = {1,8,6,7,4,3,2,5};
		
		System.out.println("even numbers are :");
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
			
		}
		
		System.out.println("odd numbers are :");
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]%2!=0)
			{
				System.out.println(a[i]);	
			}
			
		}
		

	}

}
