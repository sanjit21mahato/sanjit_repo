package difficult;

import java.util.Stack;

/*
 * Given array of distinct interger, find closet(positionwise) greater element on left of every element. 
If there is no greater element then print print -1

I/P : {15,10,18,12,4}
O/P:   -1,15,-1,18,12
*/

public class PreviousGreaterElement {

	public static void main(String[] args) {
		
		int arr[] = {15,10,18,12,4};
		printPreviousGreater(arr);

	}

	private static void printPreviousGreater(int[] arr) {

       Stack<Integer> s = new Stack<>();
	   s.push(arr[0]);
	   System.out.println(-1);
	   int n = arr.length;
	   for(int i=1; i<n;i++){
		   while(s.isEmpty() ==false && s.peek()<=arr[i]){
			   s.pop();
		   }
		  if(s.isEmpty()){
			  System.out.println(-1);
		  }else{
			  System.out.println(s.pop());
		  }
		   
		   s.push(arr[i]);
	   }
	   
	}

}
