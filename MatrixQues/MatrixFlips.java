//Write java program to flip matrix left right.
import java.util.*;
class MatrixFlips {
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

		int matRotate[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					matRotate[i][(n-1-j)] = matrix[i][j];
			}
		}

		System.out.println("Resulted matrix is ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matRotate[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
}