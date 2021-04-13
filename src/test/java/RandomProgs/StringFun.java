package RandomProgs;

public class StringFun {

	public static void main(String[] args) 
	{
		String s1 = "naniabc.txt";
		
		int n = s1.indexOf(".");
		
		System.out.println(n);
		
		String extension = s1.substring(n);
		
		System.out.println(extension);

	}

}
