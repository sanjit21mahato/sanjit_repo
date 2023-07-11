package basics;

public class DeleteHeadOfDoublyLinkedList_12 {

	public static void main(String[] args) {
		Node head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(null, 10);
		/*head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 20);
		head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 30);
		head = InsertAtBeginOfDoublyLinkedList_10.insertAtBegin(head, 40);*/
		SimpleLinkedListImplementation_2 t1 = new SimpleLinkedListImplementation_2();
		t1.traverse(head);
		head =deleteHeadOfDoublyLinkedList(head);
	    if(head!=null)
        System.out.println(head.data);
		
	}

	private static Node deleteHeadOfDoublyLinkedList(Node head) {
		if(head==null || head.next==null){
			return null;
		}
		else {
			head =head.next;
			head.previous=null;
		}
		return head;
	}

}
