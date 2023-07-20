package medium;

//Assumption is no of nodes > k
public class DeleteKthOfCircularLinkedList_20 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;

		//traverse(head);

		head = deleteKthNode(head, 2);
		traverse(head);

	}

	private static Node deleteKthNode(Node head, int k) {

		if (head == null)
			return null;

		if (k == 1) {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		} else {
			Node currentNode = head;
			for (int i = 1; i < k - 1; i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
		}

		return head;

	}

	private static void traverse(Node head) {

		if (head == null) {
			return;
		}
		Node currentNode = head;
		while (head != currentNode.next) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.data);

	}

}
