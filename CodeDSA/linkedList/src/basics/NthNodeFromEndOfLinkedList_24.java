package basics;
/*
Two Solutions:
1. find the length of linked list and 
   then traverse again upto (length-given index) 
   It needs two traversal  O(n)
2. Using two pointer
*/

public class NthNodeFromEndOfLinkedList_24 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next= new Node(50);
		
		int res= findNthNodeFromEnd(head,2);
		System.out.println(res);

	}

	private static int findNthNodeFromEnd(Node head, int k) {
		if(head==null)return -1;
		Node slow = head;
		Node fast=head;
		for(int i=0;i<k;i++){
			fast = fast.next;
		}
		while(fast!=null){
			slow= slow.next;
			fast=fast.next;
		}
		
		return slow.data;
	}

}
