//Chech whether all thr character of first string are present in second, including repeated character.

import java.util.*;
class MatchStrings {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
        	System.out.println("All characters are not present");
        }
        else {
        	int count = 0;
        for (int i = 0; i < str1.length(); i++) {
        	char ch1 = str1.charAt(i);
        	char ch2 = str2.charAt(i);
        	if (ch1 == ch2) {
        		count++;
        	}
        }
        if (count >= 1)
        	System.out.println("All characters are present");
        else
        	System.out.println("All characters are not present");
        }   
	}
}