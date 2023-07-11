package difficult;
/*
Two Solutions:
	Recursive 
	Iterative
*/

import basics.Node;

public class ReverseSinglyLinkedListInGroups_28 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		int k = 2;
		head = reverseInGroupsUsingRecursion(head, k);
		//head=reverseInGroups(head,k);
		traverse(head);

	}

	private static Node reverseInGroupsUsingRecursion(Node head, int k) {
		if(head==null){
			return null;
		}
		int count =0;
		Node current=head;
		Node previous=null;
		Node next=null;
		while(current!=null && count<k){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			count++;		
		}
		if(next!=null){
			Node headRest = reverseInGroupsUsingRecursion(next, k);
			head.next=headRest;
		}
		return previous;
	}

	/*private static Node reverseInGroups(Node head, int k) {

		if (head == null) {
			return null;
		}
		int count = 0;
		Node temp = null;
		Node currentNode = head;
		Node previous = null;
		Node next = null;
		while (currentNode != null && count<k) {
			if (count == k) {
				count = 0;
			}
			if (count == 0) {
				temp = currentNode;
			}
			next = currentNode.next;
			currentNode.next = previous;
			previous = currentNode;
			currentNode = next;
			if (count == (k - 1)) {
				head = previous;
				previous=temp;
			}
			count++;

		}
		return head;
	}*/

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
