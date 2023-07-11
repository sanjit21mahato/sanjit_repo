package medium;

import java.util.Map;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

import java.util.TreeMap;

/*
I/P : str = "geeksforgeeks";
O/P :
e: 4
f: 1
g: 2
k: 2
o: 1
r: 1
s: 2

Two solutions 
1: using tree map
2: using ASCII values 
*/


public class FrequenciesOfLowercaseCharactersInSortedOrder_2 {

	public static void main(String[] args) {
		//String str = "geeek";
		String str = "geeksforgeeks";
		
		//printFreqInSortedOrderUsingTreeMap(str);
		printFreqInSortedOrderUsingASCII(str);

	}

	private static void printFreqInSortedOrderUsingASCII(String str) {
		int freq[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) ('a' + i) + ":" + freq[i]);
			}
		}
	}

	private static void printFreqInSortedOrderUsingTreeMap(String str) {
      Map<Character, Integer> map = new TreeMap<>();
      
      for(int i=0; i<str.length(); i++) {
    	 map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1); 
      }

      /*for(Map.Entry<Character, Integer> m :map.entrySet()) {
    	  System.out.println(m.getKey() + ":"+ m.getValue());
      }*/
      map.forEach((k,v) -> System.out.println(
               k + ": " + v));
		
	}

}
