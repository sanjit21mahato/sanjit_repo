package basics;

/*
 * In Java, multidimensional array is array of objects
and it is not stored in contiguous location
so for m*n array, n can be different for each row. 
*/

public class TraverseMultiDimensionalArray {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		// int arr1[][] = new int[4][];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
			}
		}

	}

}
