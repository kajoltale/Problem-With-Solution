import java.util.*;
class MatrixBoundary {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows and column");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int matrix[][] = new int[row][col];

		System.out.println("Enter elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter submatrix size");
		int k = sc.nextInt();
		int sum, max = 0;
		int _row = 0, _col = 0;

		for (int i = 0; i < row-k+1; i++) {
			for (int j = 0; j < col-k+1; j++) {
				sum = 0;
				for (int n = i; n < i+k; n++) {
					for (int m = j; m < j+k; m++) {
						if(n == i || m == j || n == i+k-1 || m == j+k-1) {
							sum = sum + matrix[n][m];
						} 
						else {
							System.out.print("  ");
						}
					}	
				}
				if (max < sum) {
					max = sum;
					_row = i;
					_col = j;
				}			
			}
		}
		System.out.println("");
		System.out.println("Sub Matrix having maximum boundary sum is ");
	
		for (int i = _row; i < _row+k; i++) {
			for (int j = _col; j < _col+k; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}