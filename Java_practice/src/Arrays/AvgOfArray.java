package Arrays;

public class AvgOfArray {
   public static void main(String[] args) {
	   int[] array= {4,5,7,8,9,6,2,4,5};
	   int sum=0;
	   for(int i=0;i<array.length;i++) 
		   sum=sum+array[i];
	   System.out.println(sum);
	   double average = sum/array.length;
	   System.out.println(average);
   }
}
