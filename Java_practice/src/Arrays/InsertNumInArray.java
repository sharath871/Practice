package Arrays;

import java.util.Arrays;

public class InsertNumInArray {
	public static void main(String[] args) {
		int[] array= {4,5,6,8,7,9,5,44,56,55};
		System.out.println(Arrays.toString(array));
		int index=4;
		int value=22;
		for(int i=array.length-1;i>index;i--) {
			array[i]=array[i-1];
			
		}
		array[index]=value;
		System.out.println(Arrays.toString(array));
	}

}
