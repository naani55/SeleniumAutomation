package javaFaqs;

public class Rev2 {

	public static void main(String[] args) {
		
		int num = 96269;
		int orgnum = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
					
		}
		
		System.out.println(rev);
		if(orgnum == rev)
		{
			System.out.println("number is palindrome");
		}
	}

}
