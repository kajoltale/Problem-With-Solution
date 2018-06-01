import java.util.*;

class ZigZagArray {
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

			int temp = 0;
			boolean status = true;
			
			for (int i = 0; i < (size-2); i++) {
				if (status) {
					if (array[i] > array[i+1]) {
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					}
				}
				else {
				  	if (array[i] < array[i+1]) {
				  		temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					}
				}

				status = !status;
			}

			System.out.println("Elements of zig-zag array are");
			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}

			test--;
		}
	}
}