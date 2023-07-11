package basics;
/*Here, we are given a sorted linked list and data x,
Need to insert such that linked list remains sorted.
*/

public class SortedInsertInSinglyLinkedList_22 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head = sortedInsert(head,5);
		traverse(head);
		

	}
private static Node sortedInsert(Node head, int data) {
	   Node temp = new Node(data);
       if(head==null){
    	   head= new Node(data);
       }
       if(head.data>data) {
    	  temp.next=head;
    	  head=temp;
       }
       else{
    	   Node currentNode = head;
    	   while(currentNode.next!=null && currentNode.next.data<data){
    		   currentNode =currentNode.next;
    	   }
    	   temp.next=currentNode.next;
    	   currentNode.next=temp;
       }

		return head;
	}

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

}
