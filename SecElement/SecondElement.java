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

		int max = array[0], secMax = array[0];

		for (int i = 0; i < n; i++) {
			if (array[i] > max) {
				secMax = max;
				max = array[i];
			}
		}
		
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("Second smallest element is " + array[1]);
		System.out.println("Second largest element is " + secMax);
	}
}