package array.easy;

/*return the index of second largest element in one traversal 
 * if there is no second largest element then return -1
*/
public class SecondLargestElementInArray_2 {

	public static void main(String[] args) {
		int arr[] = { 4,6,1,8,13,9,15,14 };
		int res = findIndexOfSecondLargest(arr);
		if(res!=-1)
		System.out.println(arr[res]);
		else{
			System.out.println("No Second largest Element");
		}
		
		int secondLargest = findSecondLargestElement(arr);
	}

	private static int findSecondLargestElement(int[] arr) {
		if (arr.length > 2) {
			int largest = Math.max(arr[0], arr[1]);
			int secondLargest = Math.min(arr[0], arr[1]);
			for (int i = 2; i < arr.length; i++) {
				if (arr[i] > secondLargest && arr[i] < largest) {
					secondLargest = arr[i];
				}
				if (arr[i] > largest) {
					secondLargest = largest;
					largest = arr[i];
				}

			}
			return secondLargest;
		} else {
			return -1;
		}
	}

	private static int findIndexOfSecondLargest(int[] arr) {
		int indexOfLargest = 0;
		int indexOfRes =-1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[indexOfLargest]) {
				indexOfRes = indexOfLargest;
				indexOfLargest = i;
			} else if (arr[i] < arr[indexOfLargest] && arr[i] > arr[indexOfRes]) {
				indexOfRes = i;
			}
		}
		return indexOfRes;
	}

}
