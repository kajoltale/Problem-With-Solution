// Write java program to calculate sum of diagonal, right diagonal and boundary element of an matrix.
import java.util.*;
class DiagBoundarySum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size square matrix");
		int n = sc.nextInt();

		int matrix[][] = new int[n][n];
		System.out.println("Enter elements of matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i+j == (n-1) || i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
					sum = sum + matrix[i][j];

				}
			}
		}
		System.out.print("Sum is " + sum);
	}
}
/*
3
1 2 3 
4 5 6 
7 8 9
*/