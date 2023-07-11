package difficult;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/*Given an input arrya and k, we need to find the k number of largest elements of the array
I/P = {5,15,10,20,8};
k=2;
O/P: 20,15
*/

public class PrintKNoOfLargestElementInArray {

	public static void main(String[] args) {

		int arr[] = { 5, 15, 10, 20, 8 };
		int k = 2;
		printKLargestElements(arr, k);

	}

	private static void printKLargestElements(int[] arr, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		for(int i=0;i<k;i++){
			System.out.println(pq.poll());
		}

	}

}
