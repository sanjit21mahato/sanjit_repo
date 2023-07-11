package basics;

public class HeightOfBinaryTree_3 {

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.left.right = new Node(50);

		int height = findHeightOfBinaryTree(root);
		System.out.println(height);

	}

	private static int findHeightOfBinaryTree(Node root) {

		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(findHeightOfBinaryTree(root.left), findHeightOfBinaryTree(root.right));
		}
	}

}
