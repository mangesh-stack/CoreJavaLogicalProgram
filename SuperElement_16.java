package mng.app;

import java.util.Arrays;
import java.util.Scanner;

public class SuperElement_16 {
	static void superElement(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Super elements are:");
		for (int i = 0; i < length - 2; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("enter the element of array:");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		superElement(arr, length);

	}

}
