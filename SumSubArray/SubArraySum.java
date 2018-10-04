// Write java program to find subarray whose sum is equal to given sum.
import java.util.*;
class SubArraySum { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of elements");
		int n = sc.nextInt();

		System.out.println("Enter elements of array");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter a sum to check");
		int givenSum = sc.nextInt();

		System.out.println("Result is");
		int tempSum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			tempSum = tempSum + array[i]; 
			if (tempSum == givenSum) {
				System.out.print("Sum is from location " + 0 + " to " + i + "\n");
			}
			if (map.containsKey(tempSum - givenSum)) {
				if ((map.get(tempSum - givenSum)+1) < i) {
					System.out.print("Sum is from location " + (map.get(tempSum - givenSum)+1) + " to " + i);
				}
				else {
					System.out.print("Sum is from location " + i + " to " + (map.get(tempSum - givenSum)+1));
				}
			}
			else {
				map.put(i, tempSum);
			}
		}
		
	}
	
}