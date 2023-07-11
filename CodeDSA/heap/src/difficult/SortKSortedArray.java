package difficult;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
K sorted array means the array is somewhat sorted.
It means ,any element at index i will be between i-k and i+k 
index in the sorted array

int arr[] = {9,8,7,18,19,17};
		 int k =2;
	O/P : {7,8,9,17,18,19}	 
*/
public class SortKSortedArray {
	static int index = 0;

	public static void main(String[] args) {
		int arr[] = { 9, 8, 7, 18, 19, 17 };
		int k = 2;

		sortKSortedArray(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	private static void sortKSortedArray(int[] arr, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i <= k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k + 1; i < arr.length; i++) {
			arr[index++] = pq.poll();
			pq.add(arr[i]);
		}
		while (pq.isEmpty() == false) {
			arr[index++] = pq.poll();
		}
	}

}
