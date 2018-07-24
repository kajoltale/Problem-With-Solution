//Find two consecutive number in array which have maximum sum.

import java.util.*;
class MaxPair {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] array = {10,40,200,50,10};
		int maxSum = array[0]+array[1];

		for (int i = 1; i < 4; i++) {
			int temp = array[i]+array[i+1];
			if (maxSum < temp) {
				maxSum = temp;
			}
		}

		System.out.println(maxSum);
	}
	
}