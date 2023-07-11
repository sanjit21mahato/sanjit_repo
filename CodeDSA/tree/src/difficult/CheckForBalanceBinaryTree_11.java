package difficult;

/*In a Balanced Binary Tree for every node, the difference between heights of left subtree 
and right subtree should not be more than one.

Two Solutions
*/

public class CheckForBalanceBinaryTree_11 {

	public static void main(String[] args) {
		Node root = new Node(30);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left= new Node(40);
		root.left.left.left= new Node(50);
		root.right.right = new Node(60);
		
		/*
		 * this method returns -1 for unbalanced binary tree here if res =-1
		 * then it is not balanced for non-negative value it is balanced
		 */
		int res = isBalancedBinaryTree(root);
		if(res ==-1) {
			System.out.println("Not Balanced");
		}else {
			System.out.println("Balanced");
		}

	}

	private static int isBalancedBinaryTree(Node root) {

		if (root == null)
			return 0;
		int lh = isBalancedBinaryTree(root.left);
		/*if(lh<0)
			return -1;*/
		int rh = isBalancedBinaryTree(root.right);
		/*if(rh<0)
			return -1;*/
		if(Math.abs(lh-rh)>1)
			return -1;
		else {
			return 1+Math.max(lh, rh);
		}
		
	}

}
