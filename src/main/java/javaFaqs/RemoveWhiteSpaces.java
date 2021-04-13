package javaFaqs;

public class RemoveWhiteSpaces 
{

	public static void main(String[] args) 
	{
		String str = "this is a line with spaces";
		
		System.out.println("Before removing the spaces:     "+str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("after removing the spaces:     "+str);
		
		
		

	}

}
