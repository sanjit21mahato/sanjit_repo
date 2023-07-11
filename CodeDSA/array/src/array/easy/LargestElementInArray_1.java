package array.easy;

public class LargestElementInArray_1 {

	public static void main(String[] args) {

    int arr[] = {4,7,9,2,8,1,3};
    int largest = findLargestElement(arr);
       System.out.println(largest);
	}

	private static int findLargestElement(int[] arr) {

        int largest = arr[0];
        for(int i=1; i<arr.length;i++){
        	if(arr[i]>largest){
        		largest=arr[i];
        	}
        }
		return largest;
	}

}
