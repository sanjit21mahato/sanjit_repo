package difficult;

import basics.Node;

/*Two solotuion
1. traversal Big O(n) or by applying a trick for O(1)
2. Big O(1)
   By mainiting tail in LinkedList Node 
   
   
*/
public class InsertAtBeginCircularLinkedlist_17 {

	public static void main(String[] args) {

		Node head = insertAtBegin(null, 50);
		head = insertAtBegin(head, 40);
		head = insertAtBegin(head,30);
		head = insertAtBeginEfficiently(head,20);

		traverse(head);

	}

	private static Node insertAtBeginEfficiently(Node head, int data) {
		if (head == null) {
			head = new Node(data);
			head.next = head;
		} else {
			Node temp = new Node(data);
			temp.next=head.next;
			head.next=temp;
			//swap the node
			int t = head.data;
			head.data= temp.data;
			temp.data=t;
		}
		return head;
	}

	//O(n) using traversal method to find the last element which refers to head
	private static Node insertAtBegin(Node head, int data) {
		if (head == null) {
			head = new Node(data);
			head.next = head;
		} else {
			Node temp = new Node(data);
			Node currentNode = head;
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = temp;
			temp.next=head;
			head=temp;
		}

		return head;
	}

	private static void traverse(Node head) {
        if(head==null){
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
