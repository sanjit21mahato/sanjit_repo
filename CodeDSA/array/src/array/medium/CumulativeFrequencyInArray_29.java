package array.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* 
 * I/P ={1,2,2,1,3,4};
   O/P 1: 2
       2:2+2=4
       3:4+1=5
       4:5+1=6
      */

/*Notes: In HashMap insertion order in not maintained
In LinkedHashMap insertion order is maintained
In TreeMap keys stored are sorted*/

public class CumulativeFrequencyInArray_29 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 1,5,3,5, 4 };
		findCumulativeFrequency(arr);

	}

	private static void findCumulativeFrequency(int[] arr) {
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int previousFrequency = 0;
		for (Integer k : map.keySet()) {
			previousFrequency = map.get(k) + previousFrequency;
			System.out.println(k + ":" + previousFrequency);
		}

	}

}
