package difficult;
/*
Doubly linkedlist : 40--30--20--10
                  head=40
after reversing 10--20--30--40
                  head= 10
                
*/

import basics.InsertAtBeginOfDoublyLinkedList_10;
import basics.Node;
import basics.SimpleLinkedListImplementation_2;

public class ReverseDoublyLinkedList_11 {

	public static void main(String[] args) {

		Node head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(null, 10);
		head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 20);
		head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 30);
		head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 40);
		SimpleLinkedListImplementation_2 t1 = new SimpleLinkedListImplementation_2();
		// SimpleLinkedListImplementation_2.traverse(head);

		 head =reverseDoublyLinkedList(head);

		SimpleLinkedListImplementation_2.traverse(head);
		//System.out.println(head.data);

	}

	private static Node reverseDoublyLinkedList(Node head) {
		if(head==null || head.next==null){
			return head;
		}
		
		Node currentNode = head;
		Node previous =null;
	
		while(currentNode!=null){
		 previous = currentNode.previous;
		 currentNode.previous = currentNode.next;
		 currentNode.next=previous;
		 currentNode = currentNode.previous;
			
		}
		return previous.previous;
		

	}

}
