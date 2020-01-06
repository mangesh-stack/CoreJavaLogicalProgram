package mng.app;
import java.util.Scanner;
public class MinAndMaxArray_6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter integer array; ");
	int length=sc.nextInt();
	int[] a=new int[length];
	System.out.println("enter the element for array:");
	for(int i=0;i<length;i++) {
		a[i]=sc.nextInt();
	}
	//System.out.println(Arrays.toString(a));
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("min:"+a[0]+"   max:"+a[length-1]);
}
}
