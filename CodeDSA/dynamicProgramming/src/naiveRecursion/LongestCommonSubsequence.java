package naiveRecursion;
/*
Should be clear with subsequence and substring and subset

Subsequence can be obtained by picking either 0 or more charactres from string in the same order 
as they appear in string. May not be contiguous character.
Substring/subarray means need to pick contiguous characters of string or array
Subsequence means to pick character in the same order but may not be contiguous.
Subset of array/string is nothing but any possible combination of the original array
Permutation of array/string is any combination of same length of the string

Subsequence of CDA
"","C","D","A","CD","CA","DA","CDA"

IP: S1="ABCDGH"
    s2="AEDFHR"
OP: 3
*/

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "GEEK";
		String s2 = "GEFK";
		int m= s1.length();
		int n= s2.length();
		int res = findLongestCommonSubsequence(s1,s2,m,n);
		System.out.println(res);

	}

	private static int findLongestCommonSubsequence(String s1, String s2, int m, int n) {
		
		if(m==0 ||n==0){
			return 0;
		}
		if(s1.charAt(m-1)==s2.charAt(n-1)){
			return 1+findLongestCommonSubsequence(s1, s2, m-1, n-1);
		}else {
			return Math.max(findLongestCommonSubsequence(s1, s2, m-1, n), findLongestCommonSubsequence(s1, s2, m, n-1));
		}
	}

}
