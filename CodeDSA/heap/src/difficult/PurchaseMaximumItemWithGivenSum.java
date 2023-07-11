package difficult;

import java.util.PriorityQueue;

/*Given an input array with cost of items
and a sum , we need to find the maximumn number of items that can be purchase with the given sum

I/P = {1,12,5,111,220};
sum = 10;
O/P = 2 , we can purchase 1 and 5
*/
public class PurchaseMaximumItemWithGivenSum {

	public static void main(String[] args) {
		int arr[] = {1,12,5,111,220};
		int sum = 10;
		int maxItemPurchased = findMaxItemPurchased(arr,sum);
		System.out.println(maxItemPurchased);

	}

	private static int findMaxItemPurchased(int[] arr, int sum) {
       int res=0;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i=0; i<arr.length;i++) {
    	   pq.add(arr[i]);
       }
       while(pq.isEmpty()==false){
    	   int e = pq.poll();
    	   if(e<sum){
    		   res++;
    		   sum = sum-e;
    	   }
       }
		return res;
	}

}
