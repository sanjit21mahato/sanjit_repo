package difficult;

import java.util.Arrays;

/*
Heap sort is based on selection sort.
In Selection sort , max element is selected and swapped with last element , 
it does this linearly for each element so complexity becomes O(n2)
In Heap sort , first step is to create MaxHeap or MinHeap and it take O(n)
then we swap the root of the heap with last element so maximum element goes last 
and then we heapify the heap with root element.

We want to sort the array in increasing order then create MaxHeap 
and if want to sort in decreasing order then create MinHeap.

We are given an array we consider this as Complete Binary Tree
1. Create Max Heap
2. Swap last element with root 
3. Call Heapify on root
*/

public class HeapSort {


	public static void main(String[] args) {
		int arr[] = { 10, 15, 50, 4, 20 };
		buildHeap(arr);
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
         //swap
		 int temp = arr[0];
		 arr[0]= arr[n-1];
		 arr[n-1] = temp;
		 maxHeapify(arr, i, 0);
		}
	}

	private static void maxHeapify(int[] arr, int n, int i) {
		int l = (2 * i) + 1;
		int r = (2 * i) + 2;
		int largest = i;
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		while (i != largest) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[i] = temp;
			maxHeapify(arr, n, largest);
		}

	}

	private static void buildHeap(int[] arr) {
        int n = arr.length;
		for (int i = (n-2)/2; i >=0 ; i--) {
			maxHeapify(arr, n,i);
		}

	}

}
