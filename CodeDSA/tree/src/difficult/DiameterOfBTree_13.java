package difficult;

import basics.Node;

public class DiameterOfBTree_13 {
	
	static int max =0;

	public static void main(String[] args) {
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right= new Node(50);
		root.right.left.left = new Node(60);
		//root.left.left=new Node(20);
		//root.left.right=new Node(20);
		
		int height = findDiameterOfBTree(root);
		System.out.println(height);
        System.out.println("Diameter:"+ max);
	}

	private static int findDiameterOfBTree(Node root) {
		if(root==null)
			return 0;
		int lh = findDiameterOfBTree(root.left);
		int rh = findDiameterOfBTree(root.right);
		max=Math.max(max, (1+lh+rh));
		return 1+Math.max(lh, rh);
	}

}
