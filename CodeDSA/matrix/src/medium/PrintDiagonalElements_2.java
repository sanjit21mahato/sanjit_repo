package medium;

/*
1 2 3
4 5 6
7 8 9

o/p: 1 5 9

Two solutions: running two loops 
Efficient Solution: running one loop
*/

public class PrintDiagonalElements_2 {

	public static void main(String[] args) {
		//int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr[][] ={{1, 2, 3, 4},
        		      {4, 3, 2, 1},
        		      {7, 8, 9, 6},
        		      {6, 5, 4, 3}};
        
       // printDiagonalUsingNaive(arr);
        
        printDiagonalEfficient(arr,arr.length);
		

	}

	private static void printDiagonalEfficient(int[][] arr, int n) {
		System.out.print("Principal Diagonal:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i]+" ");
		}
		System.out.println();
        System.out.print("Secondary Diagonal:");
        
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][n-i-1]+" ");
		}
		
	}

	private static void printDiagonalUsingNaive(int[][] arr) {
		System.out.print("Principal Diagonal:");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println();
        System.out.print("Secondary Diagonal:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j==arr[i].length-i-1) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
	}

}
