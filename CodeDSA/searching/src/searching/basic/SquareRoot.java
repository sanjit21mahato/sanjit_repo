package searching.basic;

/*I/P : 25
O/P: 5 
If the number is not perfect square return floor of the the square root.
I/P: 13
O/P: 3
*/
public class SquareRoot {

	public static void main(String[] args) {

		int n = 13;
		int leftIndex = 0;
		int rightIndex = n;
		int squareRoot = findSquareRoot(n, leftIndex, rightIndex);
		System.out.println(squareRoot);
	}

	private static int findSquareRoot(int n, int leftIndex, int rightIndex) {
		int squareRoot = -1;

		while (leftIndex <= rightIndex) {
			int middle = (leftIndex + rightIndex) / 2;
			if (middle * middle == n)
				return middle;
			if (middle * middle > n)
				rightIndex = middle - 1;
			else
				leftIndex = middle + 1;
			    squareRoot = middle;
		}
		return squareRoot;
	}

}
