package array.medium;

/*
Maximum value = arr[j]-arr[i] such that j>i
I/p: arr[] ={2,3,10,6,4,8,1}
O/P: 8
	
i/p arr[] = {7,9,5,6,3,2,12}
o/p : 10
*/

public class MaximumDifferenceProblemWithOrder_10 {

	public static void main(String[] args) {
		int arr[] = { 2, 13, 7, 6, 8, 1, 9 ,16 };
		//int arr[] = {7,5,4,2};
		int res = maxDifferenceWithOrder(arr);
		System.out.println(res);

	}

	private static int maxDifferenceWithOrder(int[] arr) {
		int min = Math.min(arr[0], arr[1]);
		int res = arr[1]-arr[0];
		for (int i = 1; i < arr.length; i++) {
			int currentDiff = arr[i] - min;
			res = Math.max(res, currentDiff);
			min = Math.min(min, arr[i]);
		}
		return res;
	}

}
