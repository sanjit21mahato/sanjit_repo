package basics;

import java.util.PriorityQueue;

/*PriorityQueue in java internally implements MinHeap 
 * */


public class PriorityQueueIntroduction {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(20);
		pq.add(10);
		pq.add(15);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());

	}

}
