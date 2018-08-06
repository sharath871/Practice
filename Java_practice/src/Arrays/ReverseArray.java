package Arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array= {4,5,6,9,8,7,1,2,3,64};
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
