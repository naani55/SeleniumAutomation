package javaFaqs;

public class Cache {
	public static void main(String[] args)
	{   
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0, j = 0;
		boolean flag = true;
		
		for (int i = 0; i < 6; i++) 
		{
			sum = sum + a[i][j];
			
			if(j == 0)
			{
				flag = true;
			}
			if(j == 2)
			{
				flag = false;
			}
			if(flag == true)
			{
				j++;
			}
			if(flag == false)
			{
				j--;
			}
			
		}
		
		System.out.println(sum);

	}
}
