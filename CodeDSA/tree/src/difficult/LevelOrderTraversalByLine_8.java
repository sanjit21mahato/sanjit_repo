package difficult;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalByLine_8 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);

		levelOrderTraversalByLine(root);

	}

	private static void levelOrderTraversalByLine(Node root) {
		Queue<Node> q = new LinkedList<>();
        if(root==null){
        	return;
        }
		q.add(root);
		q.add(null);
		while (q.size() > 1) {
			Node currentNode = q.poll();
			if (currentNode == null) {
				System.out.println();
				q.add(null);
				continue;
			} else {
				System.out.print(currentNode.key + " ");
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
		}

	}

}
