package easy;

import medium.Node;

/*
Two solutions
Naive: O(n)
Efficient O(1)

*/
public class DeleteHeadOfCircularLinkedList_19 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;

        head= deleteHeadCircularLinkedList(head);
        head= deleteHeadCircularLinkedListEfficiently(head);
        traverse(head);

	}
    //O(1)
	private static Node deleteHeadCircularLinkedListEfficiently(Node head) {

        if(head==null){
        	return null;
        }
        if(head.next==head){
		 return null;
        }
        else {
        	head.data= head.next.data;
        	head.next=head.next.next;
        }
        return head;
	
	}
    //O(n)
	private static Node deleteHeadCircularLinkedList(Node head) {

        if(head==null){
        	return null;
        }
        if(head.next==head){
		 return null;
        }
        else {
        	Node currentNode = head;
        	while(currentNode.next!=head){
        		currentNode= currentNode.next;
        	}
        	currentNode.next =head.next;
        	head=head.next;
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
