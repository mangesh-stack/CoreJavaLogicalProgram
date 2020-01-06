package mng.app;
import java.util.Scanner;
public class PairSumEqualToGivenNumber_9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length of array:");
	int length=sc.nextInt();
	int[] a=new int[length];
	System.out.println("enter the element for array:");
	for(int i=0;i<length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter the number want to sum:");
    int sum=sc.nextInt();
	//System.out.println(Arrays.toString(a));
	System.out.println("pairs with sum 16 are:");
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(a[i]+a[j]==sum)
				System.out.println("("+a[i]+","+a[j]+")");
		}
	}
}
	
}


