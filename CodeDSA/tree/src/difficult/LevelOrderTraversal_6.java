package difficult;

public class LevelOrderTraversal_6 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);

		int height = findHeightOfBinaryTree(root);
		levelOrderTraversal(root, height);

	}

	private static void levelOrderTraversal(Node root, int height) {
		for (int i = 0; i < height; i++) {
			printNodesAtDistance(root, i);
		}

	}

	private static void printNodesAtDistance(Node root, int i) {
		if (root == null) {
			return;
		}
		if (i == 0) {
			System.out.println(root.key);
		} else {
			printNodesAtDistance(root.left, i - 1);
			printNodesAtDistance(root.right, i - 1);
		}
	}

	private static int findHeightOfBinaryTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + (Math.max(findHeightOfBinaryTree(root.left), findHeightOfBinaryTree(root.right)));
		}
	}

}
