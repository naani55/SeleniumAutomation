package javaFaqs;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int[] a = {9,8,2,11,24,6};
		
		System.out.println("before sorting : "+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
				
			}
		}
		
		System.out.println("after sorting : "+Arrays.toString(a));
	}

}
