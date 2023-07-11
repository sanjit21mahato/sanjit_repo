package basics;

public class InsertAtEndOfSinglyLinkedList_4 {
	static Node head;

	public static void main(String[] args) {

		insertAtEnd(10);
		insertAtEnd(20);
		insertAtEnd(30);
		traverse(head);

	}

	private static void insertAtEnd(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = new Node(data);

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
