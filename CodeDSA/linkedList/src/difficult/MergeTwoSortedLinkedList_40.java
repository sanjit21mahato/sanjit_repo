package difficult;

import basics.Node;

public class MergeTwoSortedLinkedList_40 {

	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		Node head2 = new Node(10);
		head2.next = new Node(25);
		Node head = mergeSortedLinkedList(head1, head2);
		traverse(head);

	}

	private static Node mergeSortedLinkedList(Node head1, Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		Node c1, c2, smaller, greater = null;
		if (head1.data <= head2.data) {
			smaller = head1;
			greater = head2;
		} else {
			smaller = head2;
			greater = head1;
		}
		Node head = smaller;
		Node tail = smaller;
		c1 = smaller.next;
		c2 = greater;
		while (c1 != null && c2 != null) {
			if (c1.data < c2.data) {
				smaller = c1;
				c1 = c1.next;
			} else {
				smaller = c2;
				c2 = c2.next;
			}
			tail.next = smaller;
			tail = smaller;
		}
		if (c1 == null && c2 != null) {
			tail.next = c2;
		} else if (c2 == null && c1 != null) {
			tail.next = c1;
		}
		return head;
	}

	private static int getCount(Node head) {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;

	}

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
