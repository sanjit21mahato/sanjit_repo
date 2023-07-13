package difficult;

/*
I/P: 1  2  3  4
     5  6  7  8
     9  10 11 12
     13 14 15 16
     
O/P:  4  8  12 16
      3  7  11 15
      2  6  10 14
      1  5  9  13
      
Two solutions:
Efficient:
1. Transpose the matrix
2. reverse individual columns
      
*/
      
public class RotateMatrixAntiClockwiseby90_6 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, 
				        { 5, 6, 7, 8 }, 
				        { 9, 10, 11, 12 }, 
				        { 13, 14, 15, 16 } };
		
		rotateMatrixAntiClockwiseBy90(arr);
		rotateMatrixAntiClockwiseBy90Efficiently(arr);

	}

	private static void rotateMatrixAntiClockwiseBy90Efficiently(int[][] arr) {
		
		//Tranpose the matrix
		for(int i =0; i<arr.length;i++) {
			for(int j=i+1;j<arr[i].length;j++){
				//swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//Reverse individual columns
		
		
	}

	private static void rotateMatrixAntiClockwiseBy90(int[][] arr) {
		
		int r = arr.length;
		int c = arr[0].length;
		for(int j=c-1;j>=0;j--){
			for(int i=0;i<r;i++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
