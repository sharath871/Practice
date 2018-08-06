package Arrays;

import java.util.Arrays;

public class Sorting_arrays {
	public static void main(String[] args) {
		int[] array= {5,6,55,43,56,45,50,68,12};
		String[] array2= {"f","s","r","b","k","d","e"};
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.print(Arrays.toString(array2));
	}

}
