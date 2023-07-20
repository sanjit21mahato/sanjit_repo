package medium;

public class CircularLinkedListTraversal_16 {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = head;

		traverseCircularLinkedList(head);

	}

	private static void traverseCircularLinkedList(Node head) {
        if(head==null){
        	return;
        }
		Node currentNode = head;
		while (currentNode.next!=head) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
       System.out.println(currentNode.data);
	}

}
