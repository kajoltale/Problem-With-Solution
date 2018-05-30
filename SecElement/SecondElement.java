import java.util.*;

class SecondElement {
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

		int max = array[0], secMax = array[0], min = array[0], secMin = array[0];

		for (int i = 0; i < n; i++) {
			if (array[i] > max) {
				secMax = max;
				max = array[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (array[i] < min) {
				secMin = min;
				min = array[i];
			}
		}

		System.out.println("Second smallest element is " + secMin);
		System.out.println("Second largest element is " + secMax);
	}
}