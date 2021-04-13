package javaFaqs;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9}; 
		int key = 9;
		boolean flag = false;
		int l = 0;
		int h = a.length-1;
		int mid=0;
		

		while(l<=h)
		{
				mid = (l+h)/2;
				
				if( key  == a[mid])
				{
					flag=true;
					System.out.println("element found at : " +mid);
					break;
				}
				else if(key > a[mid])
				{
					l = mid+1;
					
				}
				else
				{
					h = mid-1;
				}

		}
		
		if(flag == false)
		{
		
			System.out.println("element not found");
		}


	}

}
