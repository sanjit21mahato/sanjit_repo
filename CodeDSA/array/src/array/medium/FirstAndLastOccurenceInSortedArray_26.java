package array.medium;

/*
Given a sorted Array with possibly duplicate element
the task is to find indexes of first and last occurrence of an element 
int arr[] ={1,2,3,3,3,3,4,5,6};
x=3;
first occurence = 2
last occurence = 5	
*/
public class FirstAndLastOccurenceInSortedArray_26 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 3, 4, 5, 6 };
		int x = 3;
		
		int f=0;
		int l=0;
		boolean hasfA=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x && !hasfA){
				f=i;
				hasfA=true;
			}else if(arr[i]==x){
				l=i;
			}
		}
		System.out.println("f: "+f+","+"l: "+l);

		//int firstOccurence = findFirstOccurence(arr, x, 0, arr.length - 1);
		//System.out.println(firstOccurence);

	}

	private static int findFirstOccurence(int[] arr, int x, int leftIndex, int rightIndex) {
		if (leftIndex > rightIndex) {
			return -1;
		}
		int middleIndex = (leftIndex + rightIndex) / 2;
		if (x == arr[middleIndex]) {
			if (middleIndex == 0 || arr[middleIndex - 1] < x) {
				return middleIndex;
			} else {
				rightIndex = middleIndex - 1;
			}
		} else {
			if (x > arr[middleIndex])
				leftIndex = middleIndex + 1;
			else
				rightIndex = middleIndex - 1;
		}
		
		return findFirstOccurence(arr, x, leftIndex, rightIndex);
	}

}
