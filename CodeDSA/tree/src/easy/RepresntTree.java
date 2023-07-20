package easy;

import medium.Node;

/*class Node {
	int key;
	Node left;
	Node right;

	Node(int k) {
		this.key = k;
	}
}*/

public class RepresntTree {

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(20);
		root.left.left = new Node(40);
		

	}

}
