package sorting;

import java.util.Arrays;

/*
Works by considering the left element/left part sorted and
inserting the next element in left part at correct position so that 
the left part remains sorted.

It is stable and compelxity is O(n2)/O(1)

*/

public class InsertionSort {

	public static void main(String[] args) {

		// int arr[] = {2,6,1,8,5};
		int arr[] = { 20, 5, 40, 60, 10, 30 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {

		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
          arr[j+1] = key;
		}

	}

	/*
	 * private static void insertionSort(int[] arr) { int n = arr.length; for
	 * (int i = 1; i < n; i++) { for (int j = i; j > 0; j--) { if (arr[j] <
	 * arr[j - 1]) { int temp = arr[j - 1]; arr[j - 1] = arr[j]; arr[j] = temp;
	 * } }
	 * 
	 * }
	 * 
	 * }
	 */

}
