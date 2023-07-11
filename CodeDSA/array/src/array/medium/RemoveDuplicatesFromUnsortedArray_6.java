package array.medium;

import java.util.Arrays;

/*
 * Input  : a[] = {5,2,6,8,6,7,5,2,8}
   Output : a[] = {2,5,6,7,8}
         new size = 5
 * 
Using O(n) time complexity and O(1) space

Using Java8
*/

public class RemoveDuplicatesFromUnsortedArray_6 {

	public static void main(String[] args) {

     int arr[] = {5,2,6,8,6,7,5,2,8};
     // int arr[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
     // ArrayList with duplicate elements
   /*  ArrayList<Integer> numbersList = new ArrayList(Arrays.asList(arr));
     
     List<Integer> list = numbersList.stream().distinct().collect(Collectors.toList());
     for(Integer i :list){
    	 System.out.println(i);
     }*/
     //list.forEach(System.out::println);
     //System.out.println();
     
     int[] uniqueArrays = Arrays.stream(arr).distinct().toArray();
    System.out.println(Arrays.toString(uniqueArrays));
	}

	

}
