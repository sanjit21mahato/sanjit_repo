package difficult;

import basics.Node;

public class DetectAndRemoveLoopInLinkedList_30 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next =head;
		detectAndRemoveLoop(head);
		//traverse
	}

	private static void detectAndRemoveLoop(Node head) {

		if (head == null)
			return;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}

		}
		if(slow!=fast)return;

		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next=null;

	}

}
