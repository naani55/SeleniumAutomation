package javaFaqs;

public class Prime3 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}

			}
			if (b) {
				System.out.print(" -- " + i);
			}

		}
	}

}
