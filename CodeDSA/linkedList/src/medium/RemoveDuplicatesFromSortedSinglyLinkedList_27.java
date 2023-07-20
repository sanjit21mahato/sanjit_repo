package medium;

import medium.Node;

public class RemoveDuplicatesFromSortedSinglyLinkedList_27 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(20);
		head.next.next.next = new Node(30);
		head.next.next.next.next = new Node(30);
		//head.next.next.next.next.next = new Node(40);
		removeDuplicates(head);
		//removeDuplicatesTest(head);
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

	private static void removeDuplicatesTest(Node head) {

        Node c= head.next;
        Node pre= head;
        while(c!=null){
        	if(c.data!=pre.data){
        		pre.next=c;
        		pre=c;
        		c=c.next;
        	}
        	else if(c.data==pre.data){
        		c=c.next;
        	}
        }
		if(pre.data==pre.next.data){
			pre.next=c;
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
