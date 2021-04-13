package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("nani1");
		l1.add("nani2");
		l1.add("nani3");
		l1.add("nani1");
		l1.add("nani5");
		Iterator<String> i = l1.iterator();
		
		while (i.hasNext()) 
		{
			System.out.println(i.next());
			
		}

	}

}
