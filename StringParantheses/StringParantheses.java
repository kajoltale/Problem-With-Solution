//Check whether string is balance parantheses or not.

import java.util.*;
class StringParantheses {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();

		Stack<Character> input = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char start = str.charAt(i);
			if (start == '{' || start == '[' || start == '(') {
				input.push(start);
			}
		  	else {
		  		if (start == '}' || start == ']' || start == ')') {
		  			if (input.isEmpty()) {
		  				System.out.println("Not balanced");
		  			}
		  			char end = input.peek();
		  			if (start == '}' && end == '{' || start == ']' && end == '[' || start == ')' && end =='(') {
		  				input.pop();
		  			}
		  			else 
		  				System.out.println("Not balanced");
		  		}
		  	}
		}
		if (input.isEmpty()) 
			System.out.println("Balanced");
	}
}