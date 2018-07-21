//Java program to reverse string char by char.

import java.util.*;
class RevString1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		int len = str.length();
		char[] c = new char[len];
		for ( int i = 0; i < len; i++) {
			c[i] = str.charAt(len-i-1);
			System.out.print(c[i]);
		}
    }
}