package mng.app;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateZerostoLeftAllOtherRight_14 {
	static void zeroToLeft(int[] arr,int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int length=sc.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the element for array:");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		zeroToLeft(arr,length);
		for( int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	      }
		
		}
}
