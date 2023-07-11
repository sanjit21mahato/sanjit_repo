package basics;

/*
1.	Depth First traversal 
2.	Level Order traversal or Breadth First traversal

Traverse Root
Traverse LeftSub Tree
Traverse Right sub Tree

It can be done in 3 ways

In order -- Left, Root, Right
Pre Order -- Root, Left, right
Post Order -- left, right, root
*
*/


public class TreeTraversal_1 {

	public static void main(String[] args) {
		
		Node root =new Node(10);
		root.left=new Node(8);
		root.right = new Node(20);
		root.left.left=new Node(5);
		root.left.right=new Node(7);
		/*root.right.left = new Node(40);
		root.right.right= new Node(50);*/
		
		inOrderTraversal(root);
		
		// preOrderTraversal(root);
		
		//postOrderTraversal(root);
		
		
		
	}


	private static void inOrderTraversal(Node root) {
		
		/*if(root==null)
			return;*/
		if(root!=null){
			inOrderTraversal(root.left);
			System.out.println(root.key);
			inOrderTraversal(root.right);
		}
	}

	private static void preOrderTraversal(Node root) {

     if(root!=null){
    	 System.out.println(root.key);
    	 preOrderTraversal(root.left);
    	 preOrderTraversal(root.right);
     }
		
	}

	
	private static void postOrderTraversal(Node root) {

		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.key);
		}

	}
}
