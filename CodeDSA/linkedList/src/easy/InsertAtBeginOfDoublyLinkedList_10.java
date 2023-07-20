package easy;

import medium.Node;

public class InsertAtBeginOfDoublyLinkedList_10 {

	public static void main(String[] args) {
		
	Node head =insertAtBegin(null,10);
	head= insertAtBegin(head, 20);
	head= insertAtBegin(head, 30);
	SimpleLinkedListImplementation_2 t = new SimpleLinkedListImplementation_2();
	t.traverse(head);

	}

	public static Node insertAtBegin(Node head, int data) {
		 Node temp = new Node(data);
		 temp.next=head;
         if(head!=null){
        	head.previous=temp;
         }
		 return temp;
		
	}

}
