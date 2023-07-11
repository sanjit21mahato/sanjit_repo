package basics;
/*
This is another way of implementing dynamic programming called Bottom up
We start from botton ie 1 to n and if we need to calcualte for n
we would have already calculated for n-1 and can use the same. 
The idea is to leave recursion and have an array or table and build your solution bottom up manner
If you need solution for input n and if solution is dependent on n-1 or n-2 
we would have already calculated the same.
Lets see the same fibbonacci problem in bottom up way

Note: if f(n) is dependent on f(n-1) , we must have calculated f(n-1)

*/
public class Tabulation_3 {
	static int n = 5;
	static int arr[] = new int[n + 1];

	public static void main(String[] args) {
		int f = fibbTabultion(n);
		System.out.println(f);

	}

	private static int fibbTabultion(int n) {

		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

}
