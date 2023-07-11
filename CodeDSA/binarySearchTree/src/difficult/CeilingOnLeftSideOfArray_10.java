package difficult;

import java.util.TreeSet;

/*
I/P: arr[] = {2,8,30,15,25,12};
O/P :        {-1,-1,-1,30,30,15}
For first element there is nothing on left so -1 and 
for second there is element(2) but not ceiling so -1

Naive Solution:O(n2)
Efficient : O(nlogn)

*/
public class CeilingOnLeftSideOfArray_10 {

	public static void main(String[] args) {

		int arr[] = { 2, 8, 30, 15, 25, 12 };

		printCeilingOnLeftSideOfArray(arr);

	}

	private static void printCeilingOnLeftSideOfArray(int[] arr) {

		System.out.println(-1);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (ts.ceiling(arr[i])!=null) {
				System.out.println(ts.ceiling(arr[i]));
			} else {
				System.out.println(-1);
			}
			ts.add(arr[i]);
		}

	}

}
