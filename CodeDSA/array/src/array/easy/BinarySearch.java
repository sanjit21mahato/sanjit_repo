package array.easy;

import java.util.Arrays;

/*
 * Binary search is for sorted array only for unsorted array go for linear search
 or sort the array and then for for Binary Search
 */

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]={1,2,8,4,5,9,6,3,7};
		int searchedElement = 2;
		
		//first Sort the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		int leftIndex = 0;
		int rightIndex = n-1;
		int index = binarySearchUsingRecursion(arr,searchedElement,leftIndex,rightIndex);
		
		int index1 = binarySearch(arr,searchedElement,leftIndex,rightIndex);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int searchedElement, int leftIndex, int rightIndex) {
		
		while(leftIndex<=rightIndex){
			
			int mid = (leftIndex+rightIndex)/2;
			
			if(arr[mid] == searchedElement){
				return mid;
			}else if (arr[mid]>searchedElement){
				rightIndex = mid-1;
			}else {
				leftIndex = mid+1;
			}
		}
			return -1;
		
	}

	private static int binarySearchUsingRecursion(int[] arr, int searchedElement, int leftIndex, int rightIndex) {

        int middleElementIndex = (leftIndex+rightIndex)/2;
        if(searchedElement ==arr[middleElementIndex]){
        	return middleElementIndex;
        }
        if(leftIndex>rightIndex){
        	return -1;
        }
        if(searchedElement> arr[middleElementIndex]){
        	leftIndex = middleElementIndex+1;
        }
        else {
        	rightIndex = middleElementIndex-1;
        }
        	
       return binarySearch(arr,searchedElement,leftIndex,rightIndex);
		
	}

}
