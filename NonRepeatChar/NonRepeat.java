import java.util.Scanner;
import java.util.HashMap;
class NonRepeat {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char ch;
		for ( int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (hm.containsKey(ch)) 
				hm.put(ch,hm.get(ch) + 1);
			else 
				hm.put(ch,1);
		}

		for ( int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (hm.get(ch) == 1) {
				System.out.println("First non repeating char is " + ch);
				break;
			}

		} 
	}
}