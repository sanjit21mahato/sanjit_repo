package sorting;

import java.util.Arrays;

/*
Works by finding largest/smallest element index and replacing with the right most element

Complexity : O(n2)
*/
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 9, 5, 7, 3, 2 };
		selectionSorting(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSorting(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int maxIndex = 0;
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[n - 1 - i];
			arr[n - 1 - i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

	}

}
