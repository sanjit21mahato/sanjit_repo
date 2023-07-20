package medium;
/*if sum of left root and right root of each node is equal to root. */

import medium.Node;

public class ChildrenSumProperty_12 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		//root.right.left = new Node(12);
		root.right.right = new Node(2);

		boolean isChildrenSum = isChildrenSum(root);
		System.out.println(isChildrenSum);

	}

	private static boolean isChildrenSum(Node root) {

		if (root == null) {
			return true;
		}
		if(root.left ==null && root.right ==null){
		  return true;
		}
		int sum =0;
		if(root.left!=null) {
			sum = sum +root.left.key;
		}
		if(root.right!=null) {
			sum = sum + root.right.key;
		}
		
		return (root.key ==sum && (isChildrenSum(root.left) && isChildrenSum(root.right)));
	}

}
