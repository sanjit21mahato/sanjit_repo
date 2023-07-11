package extra;

import java.util.LinkedList;
import java.util.Stack;

/*
I/P : 1---2---3---4---5---6--7
K=3
O/P:  3---2---1---6---5---4--7
*/

public class ReverseLinkedListInGroup {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);

		reverseLinkedlIstInGroup(ll, 2);

		for (Integer integer : ll) {
			System.out.println(integer);

		}

	}

	private static void reverseLinkedlIstInGroup(LinkedList<Integer> ll, int k) {
		Stack<Integer> s = new Stack<>();
		int i;
		for (i=0;i < ll.size(); i++) {
			s.add(ll.get(i));
			if (s.size() == k) {
				while (s.isEmpty() == false)
					ll.set(i-(s.size()-1), s.pop());
			}
		}
		while (s.isEmpty() == false) {
			ll.set(i-(s.size()), s.pop());
		}

	}

}
