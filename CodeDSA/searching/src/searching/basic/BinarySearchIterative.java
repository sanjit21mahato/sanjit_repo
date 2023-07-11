package searching.basic;

/*Binary Search should be used only in case of sorted array*/

public class BinarySearchIterative {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 9, 15, 25, 36, 47 };
		int searchedElement = 47;
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		int searchedElementIndex = binarySearch(arr, searchedElement, leftIndex, rightIndex);
		System.out.println(searchedElementIndex);

	}

	private static int binarySearch(int[] arr, int searchedElement, int leftIndex, int rightIndex) {

		while (leftIndex <= rightIndex) {

			int mid = (leftIndex + rightIndex) / 2;

			if (arr[mid] == searchedElement) {
				return mid;
			} else if (arr[mid] > searchedElement) {
				rightIndex = mid - 1;
			} else {
				leftIndex = mid + 1;
			}
		}
		return -1;

	}

}
