package difficult;

import java.util.regex.Pattern;

/*
Given text and pattern as two strings need check if pattern is present in text or any permutations
of pattern(anagram of pattern) is present in text
Ex: text = "geeksforgeeks"
   pattern = "frog"
Here frog is directly not present but its permutation forg is present in text
So O/P : true;
I/P: "geeksforgeeks"
pattern: "rseek"
O/P: No
*/


public class AnagramSearch_14 {

	public static void main(String[] args) {
		String text = "geeksforgeeks";
		String   pattern = "frog";
		//boolean isAnagram = checkAnagramNaive(text,pattern);
		boolean isAnagram = checkAnagramEfficient(text,pattern);
		System.out.println(isAnagram);

	}

	private static boolean checkAnagramEfficient(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		int countT[] = new int[256];
		int countP[]=  new int[256];
		for(int i=0;i<m;i++){
			countT[text.charAt(i)]++;
			countP[pattern.charAt(i)]++;
		}
		for(int i=pattern.length();i<text.length();i++){
			if(areTPSame(countT,countP)){
				return true;
			}
			countT[text.charAt(i)]++;
			countT[text.charAt(i-m)]--;
		}
		return false;
	}

	private static boolean areTPSame(int[] countT, int[] countP) {
		for(int i=0;i<countT.length;i++){
			if(countT[i]!=countP[i]){
				return false;
			}
		}
		return true;
	}

	private static boolean checkAnagramNaive(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		String s = "";
		for (int i = 0; i < n - m; i++) {
			if (i == 0) {
				s = text.substring(0, m);
			} else {
				s = text.substring(i, i + m);
			}
			if (check(s, pattern) == true) {
				return true;
			}

		}
		return false;
	}

	private static boolean check(String s, String pattern) {

		int arr[] = new int[256];
		int j = 0;
		for (int i = 0; i < s.length() && j < pattern.length(); i++, j++) {
			arr[s.charAt(i)]++;
			arr[pattern.charAt(j)]--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}


}
