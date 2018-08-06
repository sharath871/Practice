package Arrays;

public class DupliArrayStr {
	public static void main(String[] args) {
		String[] array= {"a","d","c","s","a","r","s"};
		 for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if( (array[i].equals(array[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+array[j]);
	                }
	            }
	        }
	}

}
