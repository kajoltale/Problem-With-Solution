import java.util.*;

class FirstLastOcr {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of test cases");
		int test = sc.nextInt();

		while ( test != 0) {

			int firstOcr = -1, lastOcr = -1;

			System.out.println("Enter no of elements in array");
			int n = sc.nextInt();
			int[] array = new int[n];
			System.out.println("Enter sorted elements of array");
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			System.out.println("Elements of array are");
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}
			
			System.out.println(" ");

			System.out.println("Enter element whose occurance to be checked");
			int x = sc.nextInt();

			for (int i = 0; i < n; i++) {
				if (x == array[i]) {
					if (firstOcr == -1) {
						firstOcr = i;
					}
					lastOcr = i;
				}
			}

			System.out.println("First occurance of " + x + " is " + firstOcr);
			System.out.println("Last occurance of " + x + " is " + lastOcr);
			test--;
		}

	}
}