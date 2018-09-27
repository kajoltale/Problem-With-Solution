//Write java program to flip matrix upside down.
import java.util.*;
class MatrixFlip {
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
					matRotate[(n-1-i)][j] = matrix[i][j];
			}
		}

		System.out.println("Rotated matrix in clockwise ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matRotate[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
}