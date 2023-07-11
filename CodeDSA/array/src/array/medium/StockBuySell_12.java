package array.medium;
/*Each input element is price of the stock for the day and size of the array is number of days 
need to find the maximum profit that can be booked by buying and selling the stock
i/p : {1,5,3,8,12}
o/p :13

5-1 =4
12-3=9
4+9=13

O(n)

*/

public class StockBuySell_12 {

	public static void main(String[] args) {

		//int arr[] = { 1, 5, 3, 8, 12 };
		//int arr[] = { 30,20,10};
		//int arr[] = { 10,20,30};
		int arr[] = { 1, 5, 3, 1,2,8 };
		int profit = calculateMaxProfit(arr);
		System.out.println(profit);
	}

	private static int calculateMaxProfit(int[] arr) {
		int n = arr.length;
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				profit = profit + (arr[i] - arr[i - 1]);
			}
		}
		return profit;
	}

	

}
