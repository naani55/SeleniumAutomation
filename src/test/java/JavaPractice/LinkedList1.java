package JavaPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("nani1");
		l1.add("nani2");
		l1.add("nani3");
		l1.add("nani1");
		l1.add("nani3");
		
		Iterator<String> i = l1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
 	}

}
