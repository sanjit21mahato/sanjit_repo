package array.medium;

/*
 * Description : We are given an array of positive and negative integers. 
 * We have to find maximum sum of sub array (contiguous elements)

Input
[-3, 4, -1, -2, 1, 5 ]
Output
7 : 4, -1, -2, 1, 5 

Input
[2, 3, -8, 7, -1, 2, 3 ]
Output
11

This is based on principle that in an array the maximum sum of subarray at any index 
will be maximum of the sum of maximum subarray at previous element and element at index and 
the element at that index 
*/

public class MaximumSumOfSubArray_15 {

	public static void main(String[] args) {

		int arr[] = {2, 3, -8, 7, -1, 2, 3 };
		int res = calculateMaxSumOfSubArray(arr);
		System.out.println(res);

	}
   //kadane algorithm
	private static int calculateMaxSumOfSubArray(int[] arr) {
		int n=arr.length;
		int res = arr[0];
		int maxEnding = arr[0];
		for(int i=1;i<n;i++){
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(res, maxEnding);
		}
		return res;
	}

}
