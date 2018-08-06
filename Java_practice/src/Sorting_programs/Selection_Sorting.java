package Sorting_programs;

public class Selection_Sorting {
	public static void selectionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int index=i;
			for(int j=i+1;j<array.length;j++) {
				
				if(array[index]>array[j]) {
					index=j;
					
				}
			}
			int temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
	}
	public static void main(String[] args) {
		int[] array= {2,5,54,66,44,85,46,82,21,32};
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		selectionSort(array);
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	}
}
