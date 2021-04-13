package javaFaqs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int num = s.nextInt();

		int orgnum = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		if (orgnum == rev) {
			System.out.println(orgnum + " is palindrome number");
		} else {
			System.out.println(orgnum + " is not a palindrome number");
		}

		s.close();

	}

}
