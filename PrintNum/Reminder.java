//Print number if the reminder is 3 when divided by 7 and exit if user press zero.

import java.util.*;
public class Reminder  {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter any number");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			else if (num%7 == 3) {
				System.out.println(num);
			}
		}
	}
}