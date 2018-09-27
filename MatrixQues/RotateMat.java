// Write java program to rotate matrix in a place.
import java.util.*;
class RotateMat {
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

		int length = matrix.length-1;
		for (int i = 0; i <= (length)/2; i++) {
			for (int j = i; j < length-i; j++) {
				int p1 = matrix[i][j];
				int p2 = matrix[j][length-i];
				int p3 = matrix[length-i][length-j];
				int p4 = matrix[length-j][i];
				matrix[j][length-i] = p1;
			    matrix[length-i][length-j] = p2;
			    matrix[length-j][i] = p3;
			    matrix[i][j] = p4;
			}
		}

		System.out.println("Resulted matrix is ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

	}
	
}