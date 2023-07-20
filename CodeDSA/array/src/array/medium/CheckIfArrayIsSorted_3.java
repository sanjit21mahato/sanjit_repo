package array.medium;

/*
int arr[] = {8,12,15}
O/P: yes
int arr[] = {8,12,12,15}
O/P: yes
*/

public class CheckIfArrayIsSorted_3 {

	public static void main(String[] args) {

      int arr[] = {8,13,12,15};
      boolean isSorted = checkIfSorted(arr);
      System.out.println(isSorted);

	}

	private static boolean checkIfSorted(int[] arr) {
       for(int i=1;i<arr.length;i++){
    	   if(arr[i]<arr[i-1]){
    		  return false;
    	   }
       }
       return true;
	}

}
