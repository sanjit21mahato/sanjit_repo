package difficult;
/*
Given singly LinkedList segregate even odd by maintaining the order of elements

17--15--8--12--5
8--12--17--15--5

Two solutions:
1. Traverse and find the last node
traverse again add odd nodes to last node and updaet last ndoe
It needs two traversal 
2. Efficient : Solve in one traversal

 
*/

import basics.Node;

public class SegregateEvenOddNodes_34 {

	public static void main(String[] args) {
		Node head = new Node(17);
		head.next = new Node(15);
		head.next.next = new Node(8);
		head.next.next.next = new Node(12);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(20);

		head = segregateEvenOdd(head);

		traverse(head);

	}

	private static Node segregateEvenOdd(Node head) {

		if (head == null) {
			return null;
		}
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node current = head;
		while (current != null) {
			if (current.data % 2 != 0) {
				if (oddStart == null) {
					oddStart = current;
					oddEnd = current;
				} else {
					oddEnd.next = current;
					oddEnd = oddEnd.next;
				}
			} else {
				if (evenStart == null) {
					evenStart = current;
					evenEnd = current;
				} else {
					evenEnd.next = current;
					evenEnd = evenEnd.next;
				}

			}
			current = current.next;
		}
		if (evenStart == null || oddStart == null) {
			return head;
		}
		evenEnd.next = oddStart;
		oddEnd.next = null;

		return evenStart;

	}

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}
}
