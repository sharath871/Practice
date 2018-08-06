package Matrix;
import java.util.*;
public class Matrix {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println(" enter rows and column");
		int rows =sc.nextInt();
		int column=sc.nextInt();
		int[][] array=new int[rows][column];
		System.out.println("enter the values");
		for( i=0;i<rows;i++) {
			for ( j=0;j<column;j++) {
				 array[i][j]=sc.nextInt();
			}
		}
		System.out.println("the matrix is");
		for(i=0;i<rows;i++) {
			for( j=0;j<column;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
