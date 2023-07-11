package difficult;

import java.util.Collections;
import java.util.PriorityQueue;

/*
Given an sequence or array need to fidn the median at each sequence or element
median of a stream is smaller than half of the elements and greater tha half of the elements
when you have odd nuber of elements in sequence 
When you have even number then its average of of two middle elements

I/P : {25,7,10,15,20}

O/P : 25, 16, 10 , 12.5, 15

When you have sequence of elemnts first sort to find the elements
*/

public class MedianOfStream {

	public static void main(String[] args) {
		int arr[] = { 25, 7, 10, 15, 20 };

		printMedian(arr);

	}

	private static void printMedian(int[] arr) {

		PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> g = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				s.add(arr[i]);
				System.out.println(arr[i]);
			} else {
				int x = arr[i];
				if (s.size() > g.size()) {
					if (s.peek() > x) {
						g.add(s.poll());
						s.add(x);

					} else {
						g.add(x);
					}
					System.out.println((double) (s.peek() + g.peek()) / 2);

				} else {
					if (g.peek() < x) {
						s.add(g.poll());
						g.add(x);
					} else {
						s.add(x);
					}
					System.out.println(s.peek());
				}

			}

		}

	}

}
