package array.easy;

import java.util.Arrays;

public class RainTrappingWater_13 {
	/*
	 * Consider input array as vertical bar and calculate the total rain water
	 * trapped
	 *  int arr[] = {3,0,0,2,0,4}; 
	 *  O/P = 3+3+1+3 
	 *  int arr[] = {3,1,0,4};
	 * O/P = 5 
	 * int arr[] = {3,2,1}; O/P = 0
	 */

	public static void main(String[] args) {

		int arr[] ={5, 0, 6, 2, 3};
		int totalWaterTrapped = calculateWaterTrapped(arr);
		System.out.println(totalWaterTrapped);

	}

	// This approach is O(n) complexity
	private static int calculateWaterTrapped(int[] arr) {
		int totalWaterTrapped = 0;
		int n = arr.length;
		int leftMaxArr[] = new int[n];
		int rightMaxArr[] = new int[n];
		
		leftMaxArr[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftMaxArr[i] = Math.max(arr[i], leftMaxArr[i-1]);
		}
		System.out.println(Arrays.toString(leftMaxArr));
		
		rightMaxArr[n-1] = arr[n-1]; 
		for (int i = n - 2; i >= 0; i--) {
			rightMaxArr[i] = Math.max(arr[i], rightMaxArr[i+1]);
		}
		System.out.println(Arrays.toString(rightMaxArr));

		for (int i = 1; i <n - 1; i++) {
			totalWaterTrapped = totalWaterTrapped + (Math.min(leftMaxArr[i], rightMaxArr[i]) - arr[i]);
		}

		return totalWaterTrapped;

	}
}
