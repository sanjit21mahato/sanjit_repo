package basics;

/*
 I/P:  1  2  3  4
       5  6  7  8
       9  10 11 12
       13 14 15 16

O/P:  1 5 9  13
      2 6 10 14
      3 7 11 15
      4 8 12 16
*/

public class PrintTransposeOfMatrix {

	public static void main(String[] args) {
		//int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int arr[][] = {{1,1},{2,2}};
		printTransposeOfMatrix(arr);

	}

	private static void printTransposeOfMatrix(int[][] arr) {

		int r = arr.length;
		for (int i = 0; i < r; i++) {
			int c = arr[i].length;
			for (int j = 0; j < c; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}

}
