package arraysPrograms;

public class TwoMatrixAdd {

	public static void main(String[] args) {
		int rows = 2, columns = 4;
		
		int[][] matrixA = {{1, 1, 1, 1}, {2, 2, 2, 2}};
		int[][] matrixB = {{3, 3, 3, 3}, {4, 4, 4, 4}};
		
		int[][] sum = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println("Sum of the matrices is: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");			
			}
			System.out.println();
		}

	}

}
