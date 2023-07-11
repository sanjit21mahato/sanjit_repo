package sorting;

/* 
 * Divide and Conquer Algorithm
Stable Alogorithm
O(nlogn)
*/

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

      int arr[] = {9,7,8,3,2,1};
      int l =0;
      int r = arr.length-1;
      mergeSorting(arr, l, r);
      System.out.println(Arrays.toString(arr));

	}

	private static void mergeSorting(int[] arr, int l, int r) {
		
		if(r>l){
			int m = l+(r-l)/2;
			//int m = (r+l)/2;
			mergeSorting(arr,l,m);
			mergeSorting(arr,m+1,r);
			merge(arr, l,m,r);
			
		}

	}
	
	
	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2=  r-m;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0; i<n1;i++){
			//it is l+i as l may not be 0 when used for merge sort
			leftArr[i]=arr[l+i];
		}
		//System.out.println(Arrays.toString(leftArr));
		for(int j=0; j<n2;j++){
			rightArr[j]=arr[m+j+1];
		}
		//System.out.println(Arrays.toString(rightArr));
		int i=0;
		int j=0;
		int k =l;
	    while(i<n1 && j<n2) {
		  if(leftArr[i]<=rightArr[j]){
			  arr[k]= leftArr[i];
			  i++;
			  k++;
		  }else{
			  arr[k]=rightArr[j];
			  j++;
			  k++;
		  }
	   }
	   while(i<n1){
		   arr[k]=leftArr[i];
		   i++;
		   k++;
	   }
	   while(j<n2){
		   arr[k]=rightArr[j];
		   j++;
		   k++;
	   }
	}

}
