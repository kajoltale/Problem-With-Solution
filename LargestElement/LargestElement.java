//Java program to find largest and second largest element in an array.

import java.util.*;

class LargestElement {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of elements in array");
		int n = sc.nextInt();

		int[] array = new int[n];

		if (n < 2) {
			System.out.println("Enter valid input");
		}

		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (array[i] > max) {
				secMax = max;
				max = array[i];
			}
			else if (array[i] > secMax && array[i] < max) {
				secMax = array[i];
			}
		}
	
		System.out.println("Largest element is " + max);
		System.out.println("Second largest element is " + secMax);
	}
}