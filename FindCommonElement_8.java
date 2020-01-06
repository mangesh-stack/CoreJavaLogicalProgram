package mng.app;

import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElement_8{
void findCommon(int[] a1,int[] a2,int[] a3) {
		int i=0,j=0,k=0;
		System.out.println("common elements are:");
		while(i < a1.length && j < a2.length && k < a3.length) {
			if(a1[i]==a2[j] && a2[j]==a3[k]) {
				System.out.println(" "+a1[i]);
				i++;
				j++;
				k++;
			}
			else if(a1[i]<a2[j]) {
				i++;
			}
			else if( a2[j]<a3[k]) {
				j++;
			}else
				k++;
		}
	}
public static void main(String[] args) {
	//while(a1.length-1 && a2.length-1 && a3.length-1)
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lengths of 3 arrays:");
	int length1=sc.nextInt();int length2=sc.nextInt();int length3=sc.nextInt();
	int[] a1=new int[length1];
	int[] a2=new int[length2];
	int[] a3=new int[length3];
	
	
	int totalSum = length1 + length2 + length3 ;
	int c = 0 ;
	int i,j,k ;
	for(i=0, j= 0, k= 0; c < totalSum  ; i++,j++,k++) {
		 if(i<length1) {
			 System.out.println("Enter the element for first arrays:");
			 a1[i]=sc.nextInt();
		 }
		 if(j<length2) {
			 System.out.println("Enter the element for second arrays:");
			 a2[j]=sc.nextInt();
		 }
		 if(k<length3) {
			 System.out.println("Enter the element for third arrays:");
			 a3[k]=sc.nextInt();
		 }
		 ++c;
	}
	
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	System.out.println(Arrays.toString(a3));
	
	
//	int[] a1= {1,5,10,20,40,8	0};
//	int[] a2= {6,7,20,80,100};
//	int[] a3= {3,4,15,20,30,70,80,120};
//	FindCommonElement_8 ob=new FindCommonElement_8();
//     ob.findCommon(a1, a2, a3);
}
}
