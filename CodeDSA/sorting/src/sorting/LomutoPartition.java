package sorting;

/*Since Lomuto Partition works considering the last element as pivot,
So, in cases where pivot is not last element and we need to use Lomuto partition
Swap pivot element with last element*/

import java.util.Arrays;

public class LomutoPartition {

	public static void main(String[] args) {
		int arr[] ={10,80,30,90,40,50,70};
		//int arr[] ={70,60,80,40,30};
		int pivotIndexAfterPartition=lomutoPartition(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(pivotIndexAfterPartition);

	}

	private static int lomutoPartition(int[] arr) {
		
		
		int l = 0;
		int r = arr.length-1;
		int pivot = arr[r];
		int i =l-1;
		for(int j=l; j<r;j++) {
			if(arr[j] < pivot) {
				//swap
				i++;
				int temp =arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		//swap
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;
	}
    
}
