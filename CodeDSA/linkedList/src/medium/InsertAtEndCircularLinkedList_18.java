package medium;

/*Two solutions:
	1. Naive O(n) using traversal , also by appling a trick O(1)
	2. Efficient O(1) 
	   By Maintaining tail in LinkeList node structure and pass tail as argument along with
	   head and data
*/
public class InsertAtEndCircularLinkedList_18 {

	public static void main(String[] args) {
		
		Node head=insertAtEndCircularLinkedList(null,10);
		head= insertAtEndCircularLinkedList(head, 20);
		head= insertAtEndCircularLinkedList(head, 30);
		head= insertAtEndCircularLinkedListEfficient(head, 40);
		traverse(head);


	}
	
   //O(n)
	private static Node insertAtEndCircularLinkedList(Node head, int data) {
		if(head==null){
			head= new Node(data);
			head.next=head;
		}else {
			Node temp = new Node(data);
			Node currentNode = head;
			while(currentNode.next!=head){
				currentNode =currentNode.next;
			}
			currentNode.next=temp;
			temp.next=head;
		}
		
		return head;
	}
	private static Node insertAtEndCircularLinkedListEfficient(Node head, int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = new Node(data);
			head.next = head;
		} else {
			temp.next=head.next;
			head.next=temp;
			//swap the node
			int t = head.data;
			head.data= temp.data;
			temp.data=t;
		}
		return temp;
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
