import java.util.*;

class Triplet {
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

			int sum = 0, count = 0, a = 0, b = 0, c = 0;
		
			for (int i = 0; i < size; i++) {
				a = array[i] * array[i];
				for (int j = i+1; j < (size-1); j++) {
					sum = a + (array[j] * array[j]);
					if (sum == (array[j+1]*array[j+1]) || j == size) {
						count++;
					}
				}
			}

			if (count >= 1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}

			test--;
		}
	}
}