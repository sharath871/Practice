package Arrays;

public class IndexOfArrays {
	public static int index(int[] array,int t) {
		if(array==null) return -1;
		int length=array.length;
		int i=0;
		while(i<length) {
			if(array[i]==t) return i;
			else i=i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array= {4,5,55,6,8,7,5,6,8,7};
		System.out.println("index of 55 is "+index(array,55));
	}

}
