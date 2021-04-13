package JavaPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] a = {21,45,74,32,12,01,58,69,44,22,73,159,841,33};
		
		System.out.println("Array before sorting : "+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp; 
					
				}
			}
		}
		
		System.out.println("Array after sorting : "+Arrays.toString(a));
	}

}
