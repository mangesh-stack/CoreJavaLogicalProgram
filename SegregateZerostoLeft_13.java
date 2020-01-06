package mng.app;
import java.util.Scanner;
public class SegregateZerostoLeft_13 {
	static void zeroToLeft(int[] arr,int length) {
		int i = 0;
		int j = length - 1;
		while (i < j) {
			if (arr[i] == 0) {
				i++;
				continue;
			}
			if (arr[j]==1) {
				j--;
				continue;
			}
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		//System.out.println(Arrays.toString(arr));
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
