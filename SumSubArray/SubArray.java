import java.util.*;

class SubArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of test cases");
		int test = sc.nextInt();

		while (test != 0) {

			System.out.println("Enter number of elements in an array");
			int size = sc.nextInt();

			System.out.println("Enter sum");
			int sum = sc.nextInt();

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

			int subSum;

			for (int i = 0; i < size; i++) {
				subSum = array[i];
				for (int j = i + 1; j <= size; j++) {
					if (subSum == sum) {
						System.out.println("Sum is between " + i + " " + (j - 1));
					}
					if (subSum > sum || j == size) {
						break;
					}
					subSum = subSum + array[j];
				}
			}
			test--;
		}
	}
}