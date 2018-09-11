//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
//Then print the respective minimum and maximum values as a single line of two space-separated long integers.

import java.io.*;
import java.util.*;
class MinMax {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array");
		int n = sc.nextInt();

		int array[] = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		long min = Integer.MAX_VALUE, max = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + array[i];
			if (max < array[i]) 
				max = array[i];
			if (min > array[i])
				min = array[i];
		}

		System.out.println((sum - max) + " " + (sum - min));
	}
}