package medium;

/*Using height function we can get diameter of B Tree*/

public class DiameterOfBTree_13 {
	
	static int diameter =0;

	public static void main(String[] args) {
		Node root =new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right= new Node(50);
		root.right.left.left = new Node(60);
		//root.left.left=new Node(20);
		//root.left.right=new Node(20);
		
		int height = findHeightOfBTree(root);
		System.out.println(height);
        System.out.println("Diameter:"+ diameter);
	}

	private static int findHeightOfBTree(Node root) {
		if(root==null)
			return 0;
		int lh = findHeightOfBTree(root.left);
		int rh = findHeightOfBTree(root.right);
		diameter=Math.max(diameter, (1+lh+rh));
		return 1+Math.max(lh, rh);
	}

}
