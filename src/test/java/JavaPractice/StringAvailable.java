package JavaPractice;

public class StringAvailable {

	public static void main(String[] args) {
		
		String[] str = {"chinny","munny","bunny","johnny"};
		boolean b = false;
		
		for(int i=0; i < str.length; i++)
		{
			if(str[i].equalsIgnoreCase("johnny"))
			{
				b = true;
			}
			
		}
		if(b == true)
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
		}
		
	}
	

}
