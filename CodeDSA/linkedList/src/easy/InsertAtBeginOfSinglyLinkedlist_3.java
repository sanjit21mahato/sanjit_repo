package easy;

import medium.Node;

public class InsertAtBeginOfSinglyLinkedlist_3 {
     static Node head;
	public static void main(String[] args) {

      insertAtBegin(10);
      insertAtBegin(20);
      insertAtBegin(30);
      traverse(head);

	}
	private static void traverse(Node head) {
		
		Node currentNode = head;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		
	}
	private static void insertAtBegin(int data) {
		if(head==null){
		    head = new Node(data);
		}else {
			Node temp=head;
			head= new Node(data);
			head.next=temp;
		}
		
		/*Node n = new Node(data);
		n.next=head;
		head=n;*/
	}

}
