//Java program to find smallest difference between two elements of array.

import java.util.*;
class SmallestDiffer {
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

		int difference = Integer.MAX_VALUE;
		 for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((arr[i] - arr[j]) )< difference)
                    difference = Math.abs((arr[i] - arr[j]));
     
		System.out.println("Smallest difference is " + difference);
	}
}