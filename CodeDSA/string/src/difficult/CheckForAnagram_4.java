package difficult;

import java.util.HashMap;
import java.util.Map;

/*
Two strings are anagram of each other if every character of a string appears in other string and 
frequency of each character is same in both strings.

I/P  s1: listen;
     s2: silent;
  
O/P: true

Two solutions:
*/

public class CheckForAnagram_4 {
	static Map<Character, Integer> m1 = new HashMap<>();
	static Map<Character, Integer> m2 = new HashMap<>();

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		boolean isAnagram = chekAnagram(s1, s2);
		System.out.println(isAnagram);

	}

	/*private static boolean chekAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++){
			if(c1[i]!=c2[i]){
				return false;
			}
		}
		return Arrays.equals(c1, c2);

	}*/
	
	private static boolean chekAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}
		int count[] = new int[256];
		for (int i = 0, j = 0; i < s1.length() && j < s2.length();) {
			count[s1.charAt(i)]++;
			count[s2.charAt(j)]--;
			i++;
			j++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
