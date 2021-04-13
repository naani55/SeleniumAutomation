package miscellaneous;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayTestNg {

	List<Integer> list = new ArrayList<Integer>();

	@Test(priority = 0)
	public void t1() {

		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list.size(), 3);
	}

	@Test(priority = 1)
	public void t2() {
		list.remove(2);
		assertEquals(list.size(), 2);
		assertTrue(list.get(0) == 1);
		assertTrue(list.get(1) == 2);
	}

	@Test(priority = 2)
	public void t3() {
		list.remove(1);
		assertEquals(list.size(), 1);
		assertTrue(list.get(0) == 1);
	}

	@Test(groups = {"nani"})
	public void t4() {
		list.remove(0);
		assertEquals(list.size(), 0);
	}
}
