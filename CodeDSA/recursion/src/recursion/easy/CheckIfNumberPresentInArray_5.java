package recursion.easy;

public class CheckIfNumberPresentInArray_5 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int x=6;
		int i=0;
		boolean isNumberPresent = checkIfNumberPresent(arr,x, i);
		System.out.println(isNumberPresent);

	}

	private static boolean checkIfNumberPresent(int[] arr, int x, int i) {
		if(i>arr.length-1)
			return false;
		if(x==arr[i])
			return true;
		return checkIfNumberPresent(arr,x,i+1);
	}

}
