package mng.app;

import java.util.Scanner;

public class SecondMinAndMaxArray_7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System .in);
	System.out.println("enter length of array:");
	int length=sc.nextInt();
	int[] a=new int[length];
	System.out.println("enter element for array:");
	for(int i=0;i<length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	System.out.println("second Min:"+a[1]+"  second max:"+a[length-2]);
	
}
}
