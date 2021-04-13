package javaFaqs;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{
		String[] a = {"java1","python1","java","rpa","automation","python1","selenium"};
		boolean flag=false;

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] == a[j])
				{
					System.out.println("duplicate element found at index : " +i);
					flag=true;

				}
			}

		}

		if(flag == false)
		{
			System.out.println("duplicate elements not found");
		}
	}

}
