package JavaPractice;

public class Temp 
{
    public static void main(String [] args) 
    {
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)result = 1;
        System.out.println(result);
        if (b1.equals(b2))result = result + 10;
        System.out.println(result);
        if (b2 == b4)result = result + 100;
        System.out.println(result);
        if (b2.equals(b4))result = result + 1000;
        System.out.println(result);
        if (b2.equals(b3))result = result + 10000;
        System.out.println(result);
        
        int x = 0x80000000;
		System.out.print(x + " and ");
		x = x >>> 31;
		System.out.println(x);
        
        
        for (int x1 = 0;x1<7;x1++,x1++ ) 
        {
            System.out.print(" " + x1);
        }
        
        System.out.println();
        System.out.println("-------------------");
        String s1 = "xyz";
        String s2 = s1;
        //s1 += "d";
        s1.concat("d");
        System.out.println(s1 + " " + s2 + " " + (s1==s2));
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));
        
        
        
        
    }
}