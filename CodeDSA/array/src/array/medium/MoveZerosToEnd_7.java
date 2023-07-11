package array.medium;

import java.util.Arrays;

/*arr[] ={8,5,0,10,0,20}
o/p :    {8,5,10,20,0,0}

One traversal 
O(n)
O(1)
*/

public class MoveZerosToEnd_7 {
	public static void main(String[] args) {
		int arr[] = { 8,0,0,0,5,0,0,10,12,0,20,0,0 };
		
		moveZeroToEnd(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void moveZeroToEnd(int[] arr) {
		
		//first method
		/*int countNonZeroElement =0;
		for(int i=0;i<arr.length; i++){
			if(arr[i]!=0){
				arr[countNonZeroElement]=arr[i];
				countNonZeroElement++;
			}
		}
		while(countNonZeroElement<arr.length){
			arr[countNonZeroElement]=0;
			countNonZeroElement++;
		}*/
		
		//second method
		int countNonZero =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				int temp = arr[i];
				arr[i]=arr[countNonZero];
				arr[countNonZero]= temp;
				countNonZero++;
			}
		}
	}
}
