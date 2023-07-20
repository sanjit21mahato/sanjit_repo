package difficult;

import medium.Node;

public class FindLengthOfLoopInLinkedList_31 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next =head.next.next;
		
		int length = findLengthOfLoop(head);
		System.out.println(length);

	}

	private static int findLengthOfLoop(Node head) {

		int l = 1;
		if (head == null)
			return 0;

		if (head.next == head)
			return 1;

		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if(slow!=fast){
			return 0;
		}
        fast=fast.next;
		while(fast!=slow){
		 fast= fast.next;
		 l++;	
		}
		return l;
	}

}
