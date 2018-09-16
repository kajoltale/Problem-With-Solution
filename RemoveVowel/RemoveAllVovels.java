import java.util.*;
import java.io.*;
public class RemoveVowels {
 	public static void main(String[] args) {

 		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = sc.nextLine();

		str = str.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(str);
	}
}