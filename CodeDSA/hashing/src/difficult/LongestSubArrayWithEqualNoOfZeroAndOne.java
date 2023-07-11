package difficult;

/*I/P : {1,0,1,1,1,0,0}
O/P: 6

Efficient Solution O(n)
Solution:
	 Replace 0 with -1 in the prefix sumArray
	 and then check longest subArray with sum as 0
*/
	 
	

public class LongestSubArrayWithEqualNoOfZeroAndOne {

	
	public static void main(String args[]) {
		
		int arr[] = {1,0,1,1,1,0,0};
		int res = longestSubArrayWithEqualNoOfZeroAndOne(arr);
	}

	private static int longestSubArrayWithEqualNoOfZeroAndOne(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
