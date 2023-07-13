package easy;

import java.util.Arrays;

/*Jaggged Array:
	
0
1 1
2 2 2
3 3 3 3
*/

public class CreateJaggedArray_1 {

	public static void main(String[] args) {
		/*int arr[][] = new int[4][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/

		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
