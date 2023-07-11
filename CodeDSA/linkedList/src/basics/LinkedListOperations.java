package basics;

public class LinkedListOperations {
	static Node head;
	public static void main(String[] args) {
		
		insertAtBegin(10);
		insertAtBegin(5);
		
		//traverse(head);
		insertAtEnd(20);
		insertAtEnd(30);
	
		//deleteFirstNode();
		//deletelLastNode();
		insertAtPosition(15,2);
		traverse(head);
		int index = search(10);
		System.out.println(index);
	}

	private static int search(int data) {

		  Node currentNode = head;
		  int i=0;
	      while(currentNode!=null){
	    	  if(currentNode.data == data)
	    		  return i;
	    	  else {
	    	  currentNode= currentNode.next;
	    	  i++;
	    	  }
	      }
         return -1;
		
	}

	private static void insertAtPosition(int data, int index) {

    if(index==0){
    	head = new Node(data);
    	head.next= null;
    }
    else {
    	Node temp = new Node(data); 
    	Node currentNode = head;
    	int i=1;
    	while(i<index) {
    	  currentNode = head.next;
    	  i++;
    	}
    	temp.next=currentNode.next;
    	currentNode.next=temp;
    }
		
	}

	private static void insertAtEnd(int data) {
		
		Node currentNode = new Node(data);
		if(head==null){
			head.next=currentNode;
		}else {
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next=currentNode;
		}
		
	}

	private static void insertAtBegin(int data) {
		
		if(head == null){
			head = new Node(data);
			head.next = null;
		}else {
			Node currentNode = new Node(data);
			currentNode.next =head;
			head = currentNode;
		}
		
	}
	
	private static void traverse(Node head) {
		  Node currentNode = head;
	      while(currentNode!=null){
	    	  System.out.println(currentNode.data);
	    	  currentNode= currentNode.next;
	      }

		}

}
