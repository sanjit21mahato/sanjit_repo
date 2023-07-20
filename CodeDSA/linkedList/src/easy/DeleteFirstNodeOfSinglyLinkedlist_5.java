package easy;

import medium.Node;

public class DeleteFirstNodeOfSinglyLinkedlist_5 {
	
	static Node head;

	public static void main(String[] args) {
		
		head= new Node(10);
		head.next= new Node(20);
		
		deleteFirst(10);
		System.out.println(head.data);
		deleteFirst(20);
		if(head!=null){
		 System.out.println(head.data);
		}
		
	

	}

	private static void deleteFirst(int data) {
		if(head==null){
			return;
		}else{
			head=head.next;
		}
	}
	
	
	
	

}
