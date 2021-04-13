package javaprogs;

public class VowelConsonant {
	
	public static void main(String[] args)
	{
		char c = 'i';
		char c1 = 'j';
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			System.out.println(c+"  is  a vowel");
		}
		else
			System.out.println(c+"  is a consonant");
		
		
		
		switch(c1 ='j') 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c1+"  is a vowel");
			break;
		default:
			System.out.println(c1+"  is a consonant");
			break;
		
		}
		
		
	}

}
