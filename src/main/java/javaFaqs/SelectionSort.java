package javaFaqs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SelectionSort {
	
	void sortArray(int[] a)
	{
		for (int i = 0; i < a.length-1; i++) 
		{
			int min = i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j] < a[min])
				{
					min = j;
				}
				
			}
			if(min != i)
			{
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				
			}
			
		}
		
	}
	
  @Test
  public void f() {
	  
	  int[] array = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
	  System.out.println("before sorting : " +Arrays.toString(array));
	  sortArray(array);
	  System.out.println("after sorting : " +Arrays.toString(array));
	  
  }
}
