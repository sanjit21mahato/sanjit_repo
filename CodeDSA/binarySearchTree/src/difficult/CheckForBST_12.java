package difficult;

/*A simple but wrong solution:
Do traversal and for every node check if its left child is smaller and right child is greater
         20
       8    30    
          18  35
here if we see for every node it looks like BST but it is not BST since 18 is on right side of 20
Now lets see correct but inefficient 
For every node find maximum in left subtree
find minimum in right subtree 
Check if current node is greater than maximum and smaller than minimum

Efficient Solution
Pass a range for every node, for root range would be -infiniet to +infinite
For left child of a node, change the upper bound as node's value.
For right child of node change the lower bound as node's value 

Another interesting efficient solution
If in order traversal of a BST is in increasing order then it Self Balanced BST

	*/

public class CheckForBST_12 {
	static int previous = Integer.MIN_VALUE;
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(15);
		root.left.left = new Node(7);
		root.left.right = new Node(12);
		int lower = Integer.MIN_VALUE;
		int upper = Integer.MAX_VALUE;
		boolean isBST = checkForBST(root, lower, upper);
		System.out.println(isBST);
		
		
		/*boolean isBST1 = checkForBSTUsingInorderTraversal(root);
		System.out.println(isBST1);
*/
	}

	private static boolean checkForBST(Node root, int lower, int upper) {
		if (root == null) {
			return true;
		}
		return root.key > lower && root.key < upper && 
				checkForBST(root.left, lower, root.key)
				&& checkForBST(root.right, root.key, upper);
	}
	
	
	private static boolean checkForBSTUsingInorderTraversal(Node root) {
		if(root==null)return true;
		if(checkForBSTUsingInorderTraversal(root.left)==false) 
			return false;
		if(root.key<=previous)
			return false;
		previous = root.key;
		return checkForBSTUsingInorderTraversal(root.right);
		
	}

}
