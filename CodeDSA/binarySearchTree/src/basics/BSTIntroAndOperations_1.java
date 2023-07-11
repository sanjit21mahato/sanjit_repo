package basics;

/*
BST:
For every node keys in left are smaller and keys in right are greater
All keys are considered as distinct
Like linkedlist, it is a linked data structure.
It(Self Balanced BST) is implemented as TreeSet and TreeMap in Java.
  
Insert , search, delete , closet are O(h)or O(n) in BST
In Balanced BST, these operations are O(logn)

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
*/

public class BSTIntroAndOperations_1 {
	static Node root;

	public static void main(String[] args) {

	    root = insertInBST(root, 20);
	    root = insertInBST(root, 10);
	    root = insertInBST(root, 15);
	    root = insertInBST(root, 30);
	    root = insertInBST(root, 8);
	    root = insertInBST(root, 12);
	    
	   // System.out.println(root.key);

		//Search
		//boolean isElementPresent = search(root, 12);
		//System.out.println(isElementPresent);
		
		/*Delete: while deleting we need to ensure that after delete, the BST property is not violated
		If the deleted node has both left and right children then we need to replace it with 
		either closest smaller or closest higher value.
		closest greater value in BST is the inorder successor. It is the next node that comes in 
		inorder traversal as Inorder in BST is always sorted.   */ 
		/*Node n = deleteInBST(root, 10); 
		System.out.println(n.key);
		inOrderTraversal(root);*/

	}

	private static Node deleteInBST(Node root, int x) {
		if (root == null) {
			return null;
		}
		if (x < root.key) {
			root.left = deleteInBST(root.left, x);
		} else if (x > root.key) {
			root.right = deleteInBST(root.right, x);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				Node succ = findSuccessor(root);
				root.key = succ.key;
				root.right = deleteInBST(root.right, succ.key);
			}
		}
		return root;
	}

	private static Node findSuccessor(Node root) {
		Node currentNode = root.right;
		while(currentNode!=null && currentNode.left!=null) {
			currentNode = currentNode.left;
		}
        return currentNode;
	}

	private static boolean search(Node root, int key) {

		if (root == null) {
			return false;
		}
		else if (root.key == key) {
			return true;
		}

		else if (key < root.key) {
			return search(root.left, key);
		}
		else  {
			return search(root.right, key);

		}

	}

	private static Node insertInBST(Node root, int key) {
		if (root == null) {
			return new Node(key);
		} else {
			if (key < root.key) {
				root.left = insertInBST(root.left, key);
			}
			if (key > root.key) {
				root.right = insertInBST(root.right, key);
			}
			return root;

		}

	}

	private static void inOrderTraversal(Node root) {

		if (root == null)
			return;
		else {
			inOrderTraversal(root.left);
			System.out.println(root.key);
			inOrderTraversal(root.right);
		}

	}

}
