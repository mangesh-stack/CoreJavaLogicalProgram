package mng.app;

public class SumOfUniqueElement_3 {
	static int sumOfDistinct(int a[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {

			// If element appears first time
			if (a[Math.abs(a[i]) - 1] >= 0) {
				sum += Math.abs(a[i]);
				a[Math.abs(a[i]) - 1] *= -1;
			}
		}

		return sum;
	}

	// Driver code
	public static void main(String args[]) {
		int a[] = { 1,6,4,3,2,2,3,8,1};
		int n = a.length;
		System.out.println(sumOfDistinct(a, n));
	}
}
