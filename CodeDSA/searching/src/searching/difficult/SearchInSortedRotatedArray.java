package searching.difficult;

/*I/P: {10,20,30,40,50,8,9}
So  8 and 9 is rotated
x = 8
O/P : 5*/

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 8, 9 };
		int x = 8;
		int index = search(arr, x);
		System.out.println(index);

	}

	private static int search(int[] arr, int x) {

		int n = arr.length;
		int l = 0;
		int r = n - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (m == x) {
				return m;
			}
			if (arr[l]<arr[m]) {
				if (x >= arr[l] && x < arr[m]) {
					m = m - 1;
				} else {
					l = m + 1;
				}
			} else {
				if (x > arr[m] && x <= arr[r]) {
					l = m + 1;
				} else {
					r = m - 1;
				}

			}
		}

		return -1;
	}

}
