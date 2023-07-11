package array.medium;

import java.util.Arrays;

/*int arr[] = {10,20,20,30,30,30,30};
int inputSize = 7

O/P: arr[] = {10,20,30, , , , };
outputSizr =3

naive Solution: Create temp array of same size and insert only distinct element there
O(n)/O(n)
Efficient:
O(n) time
O(1) space
*/

public class RemoveDuplicatesFromSortedArray_5 {

	public static void main(String[] args) {

       int arr[] = {10,10,20,20,30,30,40,40,50};
      
       //Two efficient solutions:
      // int outputSize = removeDuplicatesUsingTwoPointer(arr);
      int outputSize= removeDuplicates(arr);
      System.out.println(outputSize);
      System.out.println(Arrays.toString(arr));     
	}

	private static int removeDuplicates(int[] arr) {
	   int inputSize = arr.length;
       int outputSize = 1;
       for(int i=1;i<inputSize;i++){
    	    if(arr[i]!=arr[outputSize-1]){
    	    	 arr[outputSize] = arr[i];
    	    	 outputSize = outputSize+1;
    	    }
       }
		return outputSize;
	}
	
	private static int removeDuplicatesUsingTwoPointer(int[] arr) {
		int slow = 0;
		int fast = 1;
		for(int i=1;i<arr.length;i++){
			if(arr[fast]!=arr[slow]){
				slow=slow+1;
				arr[slow]=arr[fast];
			}
			fast=fast+1;
		}
		return slow+1;
	}

}
