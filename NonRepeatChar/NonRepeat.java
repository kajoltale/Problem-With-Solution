import java.util.*;

class NonRepeat {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();

		char c, NonRepChar;
		int count;

		for (int i = 0; i < str.length(); i++) {
			count = 0;
			c = str.charAt(i);
			for (int j = 0;j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				NonRepChar = str.charAt(i);
				System.out.println("First non-repeating character is " + NonRepChar);
				break;
			}
		}
	}
}