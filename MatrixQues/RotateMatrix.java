// Write java program to calculate sum of diagonal, right diagonal and boundary element of an matrix.
import java.util.*;
class RotateMatrix {
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
					matRotate[j][(n-1-i)] = matrix[i][j];
			}
		}

		System.out.println("Rotated matrix in clockwise ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matRotate[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
					matRotate[(n-1-j)][i] = matrix[i][j];
			}
		}

		System.out.println("Rotated matrix in anti-clockwise ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matRotate[i][j] + " ");
			}
			System.out.println("");
		}	
	}
}
/*
4
1 2 3 4 
5 6 7 8 
9 1 2 3 
4 5 6 7
*/