package medium;

public class ReverseSinglyLinkedListIterative_25 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(35);
		head.next.next.next.next = new Node(40);

		head = reverseSinglyLinkedList(head);
		traverse(head);

	}

	private static Node reverseSinglyLinkedList(Node head) {

		if (head == null) {
			return null;
		} else {
			Node previous = null;
			Node next = null;
			Node currentNode = head;
			while (currentNode != null) {
				next = currentNode.next;
				currentNode.next = previous;
				previous = currentNode;
				currentNode=next;
			}
			return previous;
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
