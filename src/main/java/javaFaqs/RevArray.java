package javaFaqs;

import edu.emory.mathcs.backport.java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		
		for(int i=0;i<(a.length)/2;i++)
		{
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
