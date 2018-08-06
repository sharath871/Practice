package Matrix;

public class Sub_matrix {
	static int n=5;
	static void printSum(int matrix[][],int k) {
		if(k>n) return;
		for(int i=0;i<n-k+1;i++) {
			for(int j=0;j<n-k+1;j++) {
				
						System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		int matrix[][] = {{1 ,4,5,4, 6},
		                  {4 ,5, 8, 9, 1},
		                  {5 ,8, 7, 9, 2},
		                  {6 ,9, 8, 7, 4},
		                  {8, 7, 9, 4, 6}};
		
		int k=3;
		printSum(matrix,k);
		
		
	}

}
