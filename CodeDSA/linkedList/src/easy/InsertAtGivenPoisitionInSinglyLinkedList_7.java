package easy;

import medium.Node;

public class InsertAtGivenPoisitionInSinglyLinkedList_7 {
	static Node head;

	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next =new Node(30);
		head.next.next.next =new Node(40);
		insertAtIndex(3,15);
        traverse(head);
	}

	private static void insertAtIndex(int index, int data) {
		Node temp = new Node(data);
		if(index==0){
			temp.next =head;
			head=temp;
			return;
		}
		Node current = head;
		for(int i=1; i<index && current!=null ;i++){
			current =current.next;
		}
		if(current==null){
			return;
		}
		temp.next= current.next;
		current.next=temp;
		
				
/*		
		Node temp = new Node(data);
		if(index==0){
			temp.next =head;
			head=temp;
			return;
		}
		Node currentNode =head;
		Node previousNode =null;
		int i=0;
		while(i<(index)){
		 previousNode =currentNode;
		 currentNode = currentNode.next;
		 i++;
		}
		previousNode.next =temp;
		temp.next=currentNode;
*/
	}
	
	private static void traverse(Node head) {
		  Node currentNode = head;
	      while(currentNode!=null){
	    	  System.out.println(currentNode.data);
	    	  currentNode= currentNode.next;
	      }

		}

}
