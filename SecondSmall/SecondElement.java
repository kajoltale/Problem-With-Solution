//Java program to find second smallest element number from array, with O(n) complexity.

import java.util.*;
class SecondElement {
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

		if(arr == null || arr.length < 2)
			System.out.println("Can not find second element");

		int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			}
			else if (small == secondSmall || (arr[i] < secondSmall && arr[i] != small)) {
				secondSmall = arr[i];
			}
		}
		if (small == secondSmall) {
			System.out.println("Smallest element is " + small);
			System.out.println("Second smallest not found");
		}
		else {
			System.out.println("Smallest element is " + small);
			System.out.println("Second smallest element is " + secondSmall);
		}

	}
}