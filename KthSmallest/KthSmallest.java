import java.util.*;

class KthSmallest {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of test cases");
		int test = sc.nextInt();

		while (test != 0) {

			System.out.println("Enter number of elements in an array");
			int size = sc.nextInt();

			int[] array = new int[size];


			System.out.println("Enter elements of array");
			for (int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
			}
			
			System.out.println("Elements of array are");
			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}

			System.out.println(" ");

			System.out.println("Enter k");
			int k = sc.nextInt();

			int temp;

			if (k < size) {
				for (int i = 0; i < size; i++) {
					for (int j = i+1; j < size; j++) {
						if (array[i] > array[j]) {
							temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				System.out.println("Kth smallest element is " + array[k-1]);
			}

			else {
				System.out.println("Enter valid k");
			}

			test--;
		}

	}
}