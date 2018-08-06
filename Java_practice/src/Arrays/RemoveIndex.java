package Arrays;

import java.util.Arrays;

public class RemoveIndex {
	public static void main(String[] args) {
		int[] array= {5,6,2,3,4,7,8,95};
		System.out.println(Arrays.toString(array));
		
		int removeIndex=4;
		for(int i=removeIndex;i<array.length-1;i++) {
			array[i]=array[i+1];
		}	System.out.println(Arrays.toString(array));
			
	}

}
