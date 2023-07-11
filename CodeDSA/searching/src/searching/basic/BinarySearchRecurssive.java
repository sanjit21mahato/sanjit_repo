package searching.basic;

public class BinarySearchRecurssive {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 9, 15, 25, 36, 47 };
		int searchedElement = 9;
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		int searchedElementIndex = binarySearch(arr, searchedElement, leftIndex, rightIndex);
		System.out.println(searchedElementIndex);

	}

	private static int binarySearch(int[] arr, int searchedElement, int leftIndex, int rightIndex) {
		if(leftIndex > rightIndex){
        	return -1;
        }
		int mid =(leftIndex+rightIndex)/2;
		if(arr[mid]==searchedElement){
			return mid;
		}
		if(arr[mid]>searchedElement){
			rightIndex = mid-1;
		}else {
			leftIndex = leftIndex+1;
		}
        
		return binarySearch(arr, searchedElement,leftIndex, rightIndex) ;
	}

}
