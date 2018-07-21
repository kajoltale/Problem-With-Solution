//Java program to check whether string is pallindrome or not.

import java.util.*;

class Pallindrome {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.next();

		int count = 0;
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) == str.charAt(str.length()-1-i)) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Minimum characters to be inserted to convert it to palindrome are " + (str.length()-1));
		}

		if (count == (str.length()/2)) {
			System.out.println("Minimum characters to be inserted to convert it to palindrome is 0");
		}
		
	}
}