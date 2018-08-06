package Sorting_programs;

public class Insertion_Sorting{
	public static void insertionSort(int[] array) {
		for(int j=0;j<array.length;j++) {
			int key=array[j];
			int i=j-1;
			while((i>-1)&&(array[i]>key)){
			array[i+1]=array[i];
			i--;
			}
			array[i+1]=key;
		}
	}
	public static void main(String[] args) {
		int[] array= {5,66,4,56,85,456,854,54};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		insertionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
