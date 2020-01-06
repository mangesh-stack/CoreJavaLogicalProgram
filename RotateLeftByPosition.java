package mng.app;

public class RotateLeftByPosition {
	
	    /*Function to left rotate arr[] of size n by d*/
	  static  void leftRotate(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            leftRotatebyOne(arr, n); 
	    } 
	  
	 static   void leftRotatebyOne(int arr[], int n) 
	    { 
	        int i, temp; 
	        temp = arr[0]; 
	        for (i = 0; i < n - 1; i++) 
	            arr[i] = arr[i + 1]; 
	        arr[i] = temp; 
	    } 
	  
	    /* utility function to print an array */
	    /*void printArray(int arr[], int n) 
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } */
	  
	    // Driver program to test above functions 
	    public static void main(String[] args) 
	    { 
	    	//RotateLeftByPosition rotate = new RotateLeftByPosition(); 
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
	        int n=arr.length;
	        leftRotate(arr, 2, n); 
	       // rotate.printArray(arr, 7); 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	    } 
	} 
	 

