package array.easy;

/*I/P: {0,1,1,0,1,0}
O/P: 2
I/P: {1,1,1,1}
O/P: 4*/

public class MaximumConsecutiveOnesInArray_14 {

	public static void main(String[] args) {
		int arr[] = { 1,0,1,1,1,1,0,1,1};
		int res = maxConsecutiveOnes(arr);
		System.out.println(res);

	}

	private static int maxConsecutiveOnes(int[] arr) {
		int n = arr.length;
		int currentCount = 0;
		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			}
			if (arr[i] == 0) {
				currentCount = 0;
			}
		}

		return maxCount;
	}

}
