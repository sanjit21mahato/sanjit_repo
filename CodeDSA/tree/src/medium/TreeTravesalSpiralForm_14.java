package medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTravesalSpiralForm_14 {
	
	/*Tree Traversal in spiral form means, traverse root and then from right to left
	  and then from left to right and then from right to left
*/
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.left.left = new Node(60);
		root.left.left.right = new Node(70);

		//traversalInSpiralFormNaive(root);

		traversalInSpiralFormEfficient(root);
	}

	private static void traversalInSpiralFormEfficient(Node root) {

		if (root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.add(root);
		while((s1.isEmpty() == false || (s2.isEmpty() == false))) {
		while (s1.isEmpty() == false) {
			Node currentNode = s1.pop();
			System.out.println(currentNode.key);
			if (currentNode.left != null) {
				s2.add(currentNode.left);
			}
			if (currentNode.right != null) {
				s2.add(currentNode.right);
			}
		}
		while (s2.isEmpty() == false) {
			Node currentNode = s2.pop();
			System.out.println(currentNode.key);
			if (currentNode.right != null) {
				s1.add(currentNode.right);
			}
			if (currentNode.left != null) {
				s1.add(currentNode.left);
			}
		}
		}
	}

	private static void traversalInSpiralFormNaive(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<>();
		boolean reversal = false;
		q.add(root);

		while (q.isEmpty() == false) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				Node currentNode = q.poll();
				if (reversal) {
					s.add(currentNode);
				} else {
					System.out.println(currentNode.key);
				}
				if (currentNode.left != null) {
					q.add(currentNode.left);
				}
				if (currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
			if (reversal) {
				while (s.empty() == false) {
					System.out.println(s.pop().key);
				}
			}
			reversal = !reversal;

		}

	}

}
