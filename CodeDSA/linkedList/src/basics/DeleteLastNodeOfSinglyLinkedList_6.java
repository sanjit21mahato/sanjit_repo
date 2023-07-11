package basics;

public class DeleteLastNodeOfSinglyLinkedList_6 {
static Node head;
	public static void main(String[] args) {
		head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
        deleteLastNode();
        
	}
	private static void deleteLastNode() {
		
		if(head==null){
			return;
		}
		if(head.next==null){
			head =null;
		}
		Node currentNode = head;
		while(currentNode.next.next!=null){
			currentNode = currentNode.next;
		}
		currentNode.next=null;
	}

}
