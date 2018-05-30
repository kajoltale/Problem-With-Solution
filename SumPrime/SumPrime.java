import java.util.*;

class SumPrime {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no upto which sum is to be calculated");
		int n = sc.nextInt();

		int sum = 0, count = 0;

		if (n <= 1) {
			sum = 0;
		}
		else {
			for (int i = 2; i <= n; i++) {
				count = 0;
				for (int j = 2; j < i; j++) {
					if(i%j == 0) {
						count++;
						break;
			    	} 
				}
				if (count == 0) {
					sum = sum + i;
				}
			}
		}
		
		System.out.println("Sum of prime number is " + sum);
	}
}