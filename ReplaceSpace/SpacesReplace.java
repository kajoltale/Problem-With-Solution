//Urlify a string or replace spaces of string with "%20".

import java.util.*;
class SpacesReplace {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int length = str.length();

		char[] ch = str.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (ch[i] == ' ') {
				spaceCount++;
			}
		}
		int newLength = length + 2 * spaceCount;
		char [] charsNew = new char [newLength];

		for (int i = length - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				charsNew[newLength - 1] = '0';
				charsNew[newLength - 2] = '2';
				charsNew[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				charsNew[newLength - 1] = ch[i];
				newLength = newLength - 1;
			}
		}

		System.out.println("Output String : " + String.valueOf(charsNew));
	}
} 