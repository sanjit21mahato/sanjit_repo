package difficult;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree_9 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.left.left = new Node(60);

		int maxWidth = findMaxWidthofBTree(root);
		System.out.println(maxWidth);

	}

	private static int findMaxWidthofBTree(Node root) {	
       if (root == null) {
			return 0;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		int maxCount = 0;
		while(q.size()>1){
			Node currentNode = q.poll();
			if(currentNode==null){
				maxCount = Math.max(maxCount, q.size());
				q.add(null);
				continue;
			}else {
				if(currentNode.left!=null){
					q.add(currentNode.left);
				}
				if(currentNode.right!=null){
					q.add(currentNode.right);
				}
			}
			
		}
		/*while (q.isEmpty() == false) {
			int count = q.size();
			maxCount = Math.max(maxCount, count);
			for (int i = 0; i < count; i++) {
				Node currrenNode = q.poll();
				if (currrenNode.left != null) {
					q.add(currrenNode.left);
				}
				if (currrenNode.right != null) {
					q.add(currrenNode.right);
				}
			}
		}*/
		return maxCount;
	}

}
