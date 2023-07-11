package array.easy;

import java.util.Arrays;

public class ArrayRotationByPosition_8 {
	/*
	 * Rotate array by K position anticlock wise 
	Ex: arr[] ={1,2,3,4,5,6,7};
         K=2
      O/P = first Rotation:  {2,3,4,5,6,7,1}
            second Rotation: {3,4,5,6,7,1,2}
     */
	
	/*
	Solution1: 
	using temp array for K elements
	shift elements from kth Index shift by k positions
	replace elements from temp array in the main array at last
	
	Solution2: Using reverse technique.
		 * */

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7};
		int k=2;

		leftRotateArrayByKPosition(arr, k);

	}

	private static void leftRotateArrayByKPosition(int[] arr, int k) {

		reverseArray(arr, 0, k-1);

		reverseArray(arr, k, arr.length-1);

		reverseArray(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));

	}

	private static void reverseArray(int[] arr, int i, int k) {

		while (i < k) {
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			i++;
			k--;
		}

	}

}
