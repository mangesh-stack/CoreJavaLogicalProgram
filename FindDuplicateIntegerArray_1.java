package mng.app;
public class FindDuplicateIntegerArray_1 {
public static void main(String[] args) {
	int[] myArray= {1,2,5,5,6,6,7,2};
	//System.out.println(Arrays .toString(myArray ));
	for(int i=0;i<myArray.length;i++) {
		for(int j=i+1;j<myArray.length;++j) {
			if(myArray[i]==myArray[j] && i!=j) {
				System.out.print(" "+myArray[j]);
			}
		}
	}
  }
}
