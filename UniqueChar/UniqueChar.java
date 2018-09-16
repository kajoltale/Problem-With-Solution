//Write program to check if string contain unique character or not.
import java.io.*;
import java.util.*;
class UniqueChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();

		Hashtable<Character, Integer> htab = new Hashtable<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (htab.containsKey(ch)) {
				htab.put(ch, htab.get(ch) + 1);
				System.out.println("Not unique character");
				System.exit(0);
			}
			else {
				htab.put(ch, 1);
			}
		}
		System.out.println("Unique character");
	}
}