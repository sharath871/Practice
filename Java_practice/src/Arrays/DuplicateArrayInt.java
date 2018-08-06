package Arrays;

public class DuplicateArrayInt {
	public static void main(String[] args) {
		int[] array= {4,5,6,9,8,7,7,6,4,2,1,2};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if((array[i]==array[j])&&(i!=j)) {
					System.out.println(array[i]);
				}
			
		}
	}

}
}