package difficult;

/*we can construct a BTree only when Inorder and preorder is given 
 * or inorder and postorder is given
So to contruct a B Tree inorder is required along with other traversal

*/

public class ConstructBTreeFromInorderAndPreorderArrays_16 {
	
	static int preIndex =0;

	public static void main(String[] args) {
		
		int iot[]={20,10,40,30,50};
    	int pot[]={10,20,30,40,50};
		
		int is = 0;
		int ie = iot.length-1;
		Node root = constructBTree(iot, pot,is,ie);
		System.out.println(root.key);

	}
	
	private static Node constructBTree(int[] iot, int[] pot, int is, int ie) {
		
		if(is>ie){
			return null;
		}
		int index=0;
		Node root = new Node(pot[preIndex++]);
		for(int i=is;i<=ie;i++){
			if(iot[i]==root.key){
				index =i;
				break;
			}
		}
		root.left = constructBTree(iot, pot, is, index-1);
		root.right= constructBTree(iot, pot, index+1, ie);
		return root;
	}

}
