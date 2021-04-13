package javaFaqs;

public class ArraySum {

	public static void main(String[] args) {
		
		//int[] a = {10,20,30,40,50};
		//int sum = sumOfArray(a);
		//System.out.println(sum);
		int mul = multipyOfTwo(5,20);
		System.out.println(mul);
		

	}

	private static int multipyOfTwo(int i, int j) 
	{
		int k=1,sum=0;
		while(k<=j)
		{
			sum = sum+i;
			k++;
			
		}
		
		return sum;
		
	}

	private static int sumOfArray(int[] a) 
	{
		
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i]; 
			
		}
		return sum;
	}

}
