import java.util.*;
class StringPallindrome {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String rev = "";
		int len = str.length();

		for (int i = len-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if(str.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
    }
}