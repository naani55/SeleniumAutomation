package javaFaqs;

public class LargestNumber 
{

	public void largestTerinary()
	{
		int a=190,b=2000,c=3580;

		int largest = a>b?a:b;

		int largest2 = largest>c?largest:c;

		System.out.println(largest2+" is the largest number");
	}
	
	public void largestIf()
	{
		int a=190,b=2000,c=3580;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number");
			
		}else if(b>a && b>c)
		{
			System.out.println(b+" is the largest number");
			
		}
		else
		{
			System.out.println(c+" is the largest number");
		}
		
	}



	public static void main(String[] args) 
	{
		LargestNumber ln = new LargestNumber();
		
		ln.largestIf();
		ln.largestTerinary();


	}

}
