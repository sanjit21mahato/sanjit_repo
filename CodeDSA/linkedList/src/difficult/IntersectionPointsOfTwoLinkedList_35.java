package difficult;
/*
Two soultions:
	1. Using Hashing O(m+n)/O(m)
	2. O(m+n)
	
*/
import basics.Node;

public class IntersectionPointsOfTwoLinkedList_35 {

	public static void main(String[] args) {
		Node head1 = new Node(17);
		head1.next = new Node(15);
		head1.next.next = new Node(8);
		head1.next.next.next = new Node(12);
		head1.next.next.next.next = new Node(5);
		
		Node head2 = new Node(10);
		head2.next = new Node(3);
		head2.next.next = new Node(12);
		head2.next.next.next = new Node(5);
		
       int data =findInterSectionPoint(head1,head2);
       System.out.println(data);
		
	}

	private static int findInterSectionPoint(Node head1, Node head2) {
		
		int count1 = countNodes(head1);
		int count2 = countNodes(head2);
		int d= (count1-count2);
		d = Math.abs(d);
		if(count1>count2){
	        for(int i=0;i<d;i++){
	        	head1=head1.next;
	        }
		}else{
			for(int i=0;i<d;i++){
				head2=head2.next;
			}
		}
		
		Node c1= head1;
		Node c2= head2;
		while(c1!=null && c2!=null){
			if(c1.data==c2.data){
				return c1.data;
			}
			c1=c1.next;
			c2=c2.next;
		}
		return -1;
	}

	private static int countNodes(Node head) {
		int count=0;
		if(head==null)return 0;
		Node cn = head;
		while(cn!=null){
			count++;
			cn=cn.next;
		}
		return count;
	}

}
