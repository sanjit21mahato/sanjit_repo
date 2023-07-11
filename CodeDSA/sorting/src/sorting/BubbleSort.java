package sorting;

import java.util.Arrays;

/*
Works by comparating adjacent position and swaping the elements

Complexity : O(n2)

{11,15,17,29,31};

here since the array is sorted it can be optimized to have O(n) complexity
*/
public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 1, 9, 9, 5, 7, 3, 2 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		int sortedArr[] = { 11, 15, 17, 29, 31 };
		bubbleSortSortedArray(sortedArr);
		System.out.println(Arrays.toString(sortedArr));

	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	private static void bubbleSortSortedArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (isSwapped == false) {
				break;
			}
		}

	}

}
