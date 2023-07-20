package difficult;

import java.util.LinkedList;

import medium.Node;

/*class LinkedListNode{
	
	int data;
	LinkedListNode previous;
	LinkedListNode next;
	LinkedListNode(int data){
		this.data =data;
	}
	
}*/

public class ConvertBTreeToDLL_15 {
	static Node previous =null;
	static Node head; 

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);

		head = convertBTreeToDLL(root);
		System.out.println(head.key);

	}

	private static Node convertBTreeToDLL(Node root) {
		if (root == null)
			return null;
		
		convertBTreeToDLL(root.left);
		if (previous == null) {
			head = root;
		} else {
			root.left = previous;
			previous.right = root;
		}
		previous = root;

		convertBTreeToDLL(root.right);
		return head;
	}

}
