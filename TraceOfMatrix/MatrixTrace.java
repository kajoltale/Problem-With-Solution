import java.util.*;
 
class MatrixTrace{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int ncase = sc.nextInt();
		
		while(ncase != 0){
			System.out.println("Enter size of matrix");
			int size = sc.nextInt();
			
			int [][] matrix = new int[size][size];
			System.out.println("Enter elements of matrix");
			for (int i = 0; i < size; i++){
				for (int j = 0; j < size; j++){
					matrix[i][j] = sc.nextInt();
					}
				}
				
			System.out.println("Elements of matrix are");
			for (int i = 0; i < size; i++){
				for (int j = 0; j < size; j++){
					System.out.print(matrix[i][j] + " ");
					}
				System.out.println(" ");
				}
				
			int trace,max = 0,k;
 
			for (int i = 0;i < size; i++){
				for (int j = 0;j < size; j++){
					k = 0;trace = 0;
					while(i + k < size && j + k < size)
						{
							trace = trace + matrix[i + k][j + k];
							k++; 
						}                         
					if(trace > max)
					max = trace;
				}
				}
			System.out.println("Trace of submatrix is "+ max);
			ncase--;
			}
		}
	}   