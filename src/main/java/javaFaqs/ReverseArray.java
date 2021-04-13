package javaFaqs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int[] a = {2,3,4,5,7,9,10};
		int l = a.length;
		
		for (int i = 0; i < l/2; i++) 
		{
			int temp = a[i];
			a[i] = a[l-1-i];
			a[l-1-i] = temp;	
			
		}

		
		System.out.println(Arrays.toString(a));

	}

}
