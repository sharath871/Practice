package Sorting_programs;

public class Bubble_sorting {
	public static void bubbleSorting(int[] array) {
		int n=array.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(array[j]<array[j-1]){
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] array= {4,5,30,8,9,45,6,56,44,};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		bubbleSorting(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");;
		}
	}

}
