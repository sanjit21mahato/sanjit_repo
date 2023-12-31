package medium;

/*I/P: 1  2 3  4 
       5  6 7  8 
       9 10 11 12
     
O/P: 1 2 3 4 8 12 11 10 9 5   
 */

public class MatrixBoundaryTraversal_9 {

	public static void main(String[] args) {
		// int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		 int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		//int arr[][] = { { 1, 2, 3, 4 } };
        //int arr[][]= {{1},{2},{3},{4}};
		//printBoundaryTraversal(arr);
		 printBoundaryTraversalTest(arr);

	}

	private static void printBoundaryTraversalTest(int[][] arr) {
		int r = arr.length;
		for (int i = 0; i < r; i++) {
			int c= arr[i].length;
			if(i==0){
				for(int j=0;j<c;j++){
				 System.out.print(arr[i][j]+" ");
				}
			}
			if(i>0 && i<r-1){
				 System.out.print(arr[i][c-1]+" ");
			}
			if(r!=1 && i==r-1){
				for(int j=c-1;j>=0;j--){
					System.out.print(arr[i][j]+" ");
				}
				if(c!=1){
				 for(int k=r-2;k>0;k--){
					System.out.print(arr[k][0]+" ");
				}
				}
			}
		}
		
	}

	private static void printBoundaryTraversal(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				for (int j = 0; j < arr[i].length; j++)
					System.out.print(arr[i][j] + " ");
			}
			if (i != 0 && i != arr.length - 1) {
				int j = arr[i].length - 1;
				System.out.print(arr[i][j] + " ");
			}
			// to handle corner case if there is single row
			if (arr.length > 1) {
				if (i == arr.length - 1) {
					for (int j = arr[i].length - 1; j >= 0; j--)
						System.out.print(arr[i][j] + " ");
				}
			}
		}
       
		for (int i = arr.length - 2; i > 0; i--) {
			// to handle corner case if there is single column multiple rows
			if (arr[i].length > 1) {
				int j = 0;
				System.out.print(arr[i][j] + " ");
			}
		}

	}

}
