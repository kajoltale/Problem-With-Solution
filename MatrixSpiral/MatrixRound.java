import java.util.*;

class MatrixRound {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and columns of matrix");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];

		System.out.println("Enter elements of matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements of matrix are");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}

		int startRow = 0, startCol = 0;

		System.out.println("Elements of matrix in give pattern");
		while (startRow < row && startCol < col) {
			for (int i = startCol; i < col; i++) {
				System.out.print(matrix[startRow][i] + " ");
			}
			startRow++;

			for (int i = startRow; i < row; i++) {
				System.out.print(matrix[i][col - 1] + " ");
			}
			col--;

			if (row > startRow) {
				for (int i = col-1; i >= startCol; i--) {
					System.out.print(matrix[row - 1][i] + " ");
        		}
        		row--;
			}
			i
			

        	if (col > startCol) {
        		for (int i = row-1; i >= startRow; i--) {
        			System.out.print(matrix[i][startCol] + " ");
        		}
        		startCol++;
        	}
		}
	}
}