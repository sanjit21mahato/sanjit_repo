package difficult;

import java.util.Arrays;

/*
 I/P:  1  2  3  4
       5  6  7  8
       9  10 11 12
       13 14 15 16

O/P:  1 5 9  13
      2 6 10 14
      3 7 11 15
      4 8 12 16
      
 Naive solution is to create temp arr of same size and then copy from temp array to original array
 
 Efficient Solution     
 
 the diagonal elements remains same in tranposed matrix 
 so swap the elements of upper diagonal elements with corresponding lower diagonal elements
*/

public class TransposeOfMatrixInSameArray_5 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//int arr[][] = {{1,1},{2,2}};
		transposeOfMatrix(arr);
		
		//printing matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void transposeOfMatrix(int[][] arr) {

		for(int i =0; i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++){
				//swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

}
