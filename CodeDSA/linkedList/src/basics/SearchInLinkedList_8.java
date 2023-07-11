package basics;

public class SearchInLinkedList_8 {
static Node head;
	public static void main(String[] args) {
		head = new Node(10);
		head.next = new Node(20);
		head.next.next =new Node(30);
		head.next.next.next =new Node(40);
        int indexP =search(30);	
        System.out.println(indexP);

	}
	private static int search(int data) {
		/*if(head.data==data){
			return 0;
		}*/
		int p=0;
		Node currentNode = head;
		while(currentNode!=null){
			if(currentNode.data ==data){
				return p;
			}
			currentNode = currentNode.next;
			p++;
		}
		
		return -1;
	}

}
