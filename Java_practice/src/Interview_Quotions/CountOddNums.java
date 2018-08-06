package Interview_Quotions;

import java.util.Scanner;

public class CountOddNums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter the no.of values");
		int size=sc.nextInt();
		int count=0;
		int a[]=new int[size];
		System.out.print(" enter the values");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("list of even values");
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" ");
				count++;
			}
		}
		System.out.println("even nums count"+count);
	}

}
