package mng.app;

import java.util.Scanner;

public class LeftRotateArray_11 {
	static void leftRotate(int[] a,int shift,int length) {
		for(int i=0;i<shift;i++) 
			leftRotateByOne(a,length);
	}
	
	static void leftRotateByOne(int[] a,int length) {	
		int i,temp=a[0];
		for(i=0;i<length-1;i++) 
			a[i]=a[i+1];
			a[i]=temp;
	}

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int length=sc.nextInt();
       int[] a=new int[length];
       System.out.println("Enter the element of array:");
       for(int i=0;i<length;i++) {
    	   a[i]=sc.nextInt();
       }
       System.out.println("enter the position of shifting array:");
       int shift=sc.nextInt();
       leftRotate(a,shift,length);
       for(int i=0;i<length;i++) {
       System.out.print(" "+a[i]);
       }
       
	}

}
