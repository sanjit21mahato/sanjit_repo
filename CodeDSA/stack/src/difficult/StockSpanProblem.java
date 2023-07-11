package difficult;

import java.util.Stack;

/*Given an array of integers which represents prices of stock for n mumber of days.
We need to find span of stock on everyday
Span on day is number of days including current day and days just before it
which have value equal or smaller

I/P: {13,15,12,14,16,8,6,4,10,30}
O/P:  1, 2, 1, 2, 5, 1,1,1,4, 10

I/P: {60,10,20,15,35,50}
O/P:   1, 1, 2, 1, 4,5
*/

public class StockSpanProblem {

	public static void main(String[] args) {

		int arr[] = { 13, 15, 12, 14, 16, 8, 6, 4, 10, 30 };
		//int arr[] = {60,10,20,15,35,50};
		findStockSpan(arr);

	}

	private static void findStockSpan(int[] arr) {
		Stack<Integer> stack = new Stack<>();

		int n = arr.length;
		stack.push(0);
		
		System.out.println(1);
		for (int i = 1; i < n; i++) {
			while(stack.isEmpty() ==false &&  arr[stack.peek()]<=arr[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				System.out.println(i+1);
			}else {
				System.out.println(i-stack.peek());
			}
			stack.push(i);

		}

	}

}
