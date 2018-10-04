// Write java program to find pair whose sum is equal to given sum.
import java.util.*;
class SumArray { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter tempSumber of elements");
		int n = sc.nextInt();

		System.out.println("Enter elements os array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter a sum to check");
		int givenSum = sc.nextInt();

		int start = 0;
		int end = n-1;

		System.out.println("Result is");
		while(start < end && start!= end) {

			int tempSum = array[start] + array[end];
			if(tempSum == givenSum) {
				System.out.println(array[start]+ " " + array[end]);
				start++;
				end--;
			}
			if(tempSum < givenSum ) {
				end--;
			}
			if (tempSum > givenSum) {
				start++;
			}
		}
	}
	
}