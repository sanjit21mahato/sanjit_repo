package array.easy;

import java.util.Arrays;

public class ReverseAnArray_4 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int left = 0;
		int right = arr.length-1;
		//reverseArrayUsingRecursion(arr, left, right);
		reverseArray(arr, left, right);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr, int left, int right) {

      while(left<right){
    	  swap(arr, left, right);
    	  left = left+1;
    	  right = right-1;
       }
		
	}

	private static void reverseArrayUsingRecursion(int[] arr, int left, int right) {
		if (left > right)
			return;
		swap(arr, left, right);
		reverseArrayUsingRecursion(arr, left + 1, right - 1);
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

	}

}
