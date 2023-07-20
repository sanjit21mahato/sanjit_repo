package practice;

import java.net.ConnectException;
import java.util.LinkedList;
import java.util.Queue;

import medium.Node;

/*Given a binary tree, connect the nodes that are at the same level. The structure of the tree Node contains an addition nextRight pointer for this purpose.

Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.

       10                       10 ------> NULL
      / \                       /      \
     3   5       =>     3 ------> 5 --------> NULL
    / \     \               /  \           \
   4   1   2          4 --> 1 -----> 2 -------> NULL

 

Example 1:

Input:
     3
   /  \
  1    2
Output:
3 1 2
1 3 2
Explanation:The connected tree is
       3 ------> NULL
     /   \
    1---> 2 -----> NULL
    
Note: The generated output will contain 2 lines. First line contains the level order traversal of the tree and second line contains the inorder traversal of the tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
    */
    

public class ConnnectNodesAtSameLevel {

	public static void main(String[] args) {
		Node root= new Node(10);
		root.left=new Node(20);
		root.right = new Node(30);
		root.left.left= new Node(40);
		root.left.right = new Node(60);
		
		connect(root);

	}

	private static void connect(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		if (root == null) {
			return;
		} else {
			q.add(root);
			int count = 0;
			while (q.isEmpty() == false) {
				count = q.size();
				for (int i = 0; i < count; i++) {
					Node currentNode = q.poll();
					if (i == (count - 1)) {
						currentNode.nextRight = null;
					} else {
						currentNode.nextRight = q.peek();
					}
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

}
