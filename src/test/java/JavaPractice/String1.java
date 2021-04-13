package JavaPractice;

public class String1 {

	public static void main(String[] args) {
		
		String str1 = "JOHN123";
		System.out.println(str1.length());
		
		for (int i = 0; i < str1.length(); i++) // To print normal
		{
			System.out.print(str1.charAt(i));
			
		}

		System.out.println(" ");
		
		for(int i=str1.length()-1; i>=0; i--)   // To print Reverse
		{
			System.out.print(str1.charAt(i));		
		}
		System.out.println();
		System.out.println(str1.substring(3));
	}

}
