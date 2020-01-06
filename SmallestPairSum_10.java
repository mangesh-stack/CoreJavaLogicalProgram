package mng.app;

import java.util.Scanner;

public class SmallestPairSum_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int length=sc.nextInt();
		System.out.println("enter element of array:");
		int[] a=new int[length];
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
		System.out.println("("+a[0]+","+a[1]+") is the smallest pair and sum="+(a[0]+a[1]));
		
	}
	

}
