package array.easy;

/*
 * int arr[] = {1,2,3,4,5,6};
   int k=3;
   O/P : 15		
 * Two Solutions
 * Solution1 : using two loops 
 * Complexity O(n*k)
 * 
 * Solution2 : Window Sling Technique
 * Complexity: O(n)
*/
public class MaximumSumofKConsecutiveElements_28 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,9,4,5,6};
		int k=3;
		int maxSum =0;
		maxSum = getMaxSumOfKConsecutiveElements(arr, k);
		System.out.println(maxSum);
		
		

	}
	private static int getMaxSumOfKConsecutiveElements(int[] arr, int k) {
		int n = arr.length;
        int currentSum =0;
        int maxSum =0;
       for(int i=0; i<k;i++){
    	   currentSum = currentSum +arr[i];
       }
       maxSum = currentSum;
	   //for(int i=k;i<n;i++){
       int i=k;
       while(i<n-1){
		   currentSum = currentSum+arr[i]-arr[i-k];
		   maxSum = Math.max(maxSum, currentSum);
		   i++;
	   }
		return maxSum;
	}

}
