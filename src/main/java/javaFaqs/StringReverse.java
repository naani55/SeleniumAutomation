package javaFaqs;

public class StringReverse {

	public static void main(String[] args) 
	{
		
		String str = "kushi";
		String rev = "";
		
		for (int i = str.length()-1; i >=0; i--) 
		{
			rev += str.charAt(i);
			System.out.print(str.charAt(i));
			
		}
		
		System.out.println(rev);

	}

}
