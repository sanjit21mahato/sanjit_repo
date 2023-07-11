package basics;

import basics.Node;

public class RemoveDuplicatesFromSortedSinglyLinkedList_27 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		removeDuplicates(head);
		traverse(head);

	}

	private static void removeDuplicates(Node head) {
		if (head == null) {
			return;
		}
		Node currentNode = head;
		Node nextNode = currentNode.next;
		while (nextNode != null) {
			if (nextNode.data == currentNode.data) {
				currentNode.next = nextNode.next;
				nextNode = currentNode.next;
			}else{
			currentNode = currentNode.next;
			nextNode = currentNode.next;
			}

		}
	}

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
