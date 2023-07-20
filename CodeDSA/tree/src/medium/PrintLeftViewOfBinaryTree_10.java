package medium;

import java.util.LinkedList;
import java.util.Queue;

import medium.Node;

/*Left view of binary tree is the nodes that are visible from left side
 * 
 * Solution1 : Recurssive
 * Solution2 : Iterative */

public class PrintLeftViewOfBinaryTree_10 {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.left.right.left= new Node(60);
		root.right.right= new Node(70);
		printLeftViewOfBinaryTreeusingQueue(root);
	}

	private static void printLeftViewOfBinaryTreeusingQueue(Node root) {

		Queue<Node>q = new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty()==false){
			int count = q.size();
			for(int i=0;i<count;i++){
				Node currentNode = q.poll();
				if(i==0){
					System.out.println(currentNode.key);
				}
				if(currentNode.left!=null){
					q.add(currentNode.left);
				}
				if(currentNode.right!=null){
					q.add(currentNode.right);
				}
			}
		}	
	}
}

	