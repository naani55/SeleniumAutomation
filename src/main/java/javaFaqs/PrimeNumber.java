package javaFaqs;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int count=0,num=19853;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(num+" is a prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}

	}

}
