package basics;

//maximum value of a node in binary tree

public class MaximumInBinaryTree_4 {

	public static void main(String[] args) {
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right= new Node(50);
		int maximum = findMax(root);
        System.out.println(maximum);
	}	

	private static int findMax(Node root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(root.key, Math.max(findMax(root.left), findMax(root.right)));
		}
	}

}
