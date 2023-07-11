package difficult;

import java.util.HashSet;

/*I/P: {5,8,6,13,3,-1};
Given Sum : 22
O/P: true
*/
public class SubArrayWithGivenSum {

	public static void main(String[] args) {

          int arr[] = {5,8,6,13,3,-1};
          int givenSum =22;
          System.out.println(isSubArrayWithGivenSum(arr,givenSum));

	}

	private static boolean isSubArrayWithGivenSum(int[] arr, int givenSum) {

		HashSet<Integer> set = new HashSet<Integer>();
		int prefixSum = 0;
		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];
			if (set.contains(prefixSum - givenSum)  || prefixSum ==givenSum) {
				return true;
			}

			set.add(prefixSum);
		}
		return false;
	}

}
