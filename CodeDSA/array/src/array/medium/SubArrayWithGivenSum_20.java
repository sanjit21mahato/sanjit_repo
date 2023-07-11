package array.medium;
/*
need to check if there exist sub array with a given sum
 * i/p: {1,4,20,3,10,5}
sum :33
O/P : True

O(n)/O(1)

*/

public class SubArrayWithGivenSum_20 {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int givenSum = 33;
		boolean isSubArrayWithGivenSum = checkSubArrayWithGivenSum(arr, givenSum);
		System.out.println(isSubArrayWithGivenSum);
	}

	private static boolean checkSubArrayWithGivenSum(int[] arr, int givenSum) {

		int n = arr.length;
		int currentSum = arr[0];
		int indexOfElementForRemoval = 0;
		for (int i = 1; i < n; i++) {
			currentSum = currentSum + arr[i];
			while (currentSum > givenSum) {
				currentSum = currentSum - arr[indexOfElementForRemoval];
				indexOfElementForRemoval++;
			}
			if (currentSum == givenSum) {
				for(int j = indexOfElementForRemoval; j<=i;j++) {
					System.out.println(arr[j]);
				}
				return true;
			}
		}
		return false;

	}

}
