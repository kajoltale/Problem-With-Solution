//Java program to find maximum difference between two elements of array.

import java.util.*;
class MaxDiffer {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements in an array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements of array are");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println(" ");

		int small = arr[0];
		int difference = arr[0] - arr[1];
		for (int i = 0; i < n; i++) {
			if (arr[i]-small > difference) {
				difference = arr[i] - small;
			}
			if (arr[i] < small) {
				small = arr[i];
			}
		}

		System.out.println("Maximum difference is " + difference);
	}
}