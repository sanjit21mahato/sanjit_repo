package array.medium;

/*I/P :{5,10,20,6,3,8};
O/P: 3

I/P : {7,10,13,14}
O/P: 4*/

public class LongestEvenOddSubArray_16 {

	public static void main(String[] args) {
     int arr[] = {5,10,20,6,3,8};
     int res = findLongestEvenOddSubArray(arr);
     System.out.println(res);

	}

	private static int findLongestEvenOddSubArray(int[] arr) {
       int currentCount = 1;
       int res = 1;
       int n = arr.length;
       
       for(int i=1; i<n;i++){ 
    	   if((arr[i]%2==0 && arr[i-1]%2!=0) ||
    			   arr[i]%2!=0 && arr[i-1]%2==0 ){
    		   currentCount = currentCount+1;
    		   res = Math.max(currentCount, res);
    	   }else {
    		   currentCount = 1;
    	   } 
       }
		return res;
	}

}
