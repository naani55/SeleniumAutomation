package javaFaqs;

public class SaddlePoint {

	public static void main(String[] args) 
	{
		int a[][] = {{1, 2, 3},{4, 7, 6},{9, 8, 5}};
		int n = 3;
		boolean flag = false;
		for (int i = 0; i < n; i++) 
        {  
            int min_row = a[i][0], col = 0;
            
	            for (int j = 1; j < n; j++) 
	            { 
	                if (min_row > a[i][j]) 
		                { 
		                    min_row = a[i][j]; 
		                    col = j; 
		                } 
	            } 
       
            int k; 
            for (k = 0; k < n; k++)
	            {
	            	if (a[k][col] > min_row )
	                    break; 
	            }
                
	            if (k == n) 
	            { 
	               System.out.println("Saddle Point is : " + min_row);
	               flag = true; 
	            }
            
       }
		
		if(flag == false)
		{
            	System.out.println("no saddle point");
		}

	}

}
