package mng.app;
import java.util.Arrays;
public class RemoveDuplicate_2 {
	public static int removeDuplicateElements(int arr[], int n) {
		/*if (n == 0 || n == 1) {
			return n;
		}*/
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,3,4,1};// unsorted array
		Arrays.sort(arr);// sorting array
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}

}
