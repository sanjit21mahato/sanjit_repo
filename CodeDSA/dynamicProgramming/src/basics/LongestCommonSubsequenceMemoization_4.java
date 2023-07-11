package basics;

import java.util.Arrays;

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

public class LongestCommonSubsequenceMemoization_4 {
	static int m,n;
	static int memo[][]; 

	public static void main(String[] args) {
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		int m= s1.length();
		int n= s2.length();
		memo=new int[m+1][n+1];
		for(int[] i: memo)
	    {
	        Arrays.fill(i,-1);
	    }
		int res = findLongestCommonSubsequence(s1,s2,m,n);
		System.out.println(res);

	}

	private static int findLongestCommonSubsequence(String s1, String s2, int m, int n) {
		int res=0;
		if(memo[m][n]==-1) {
			if(m==0 ||n==0){
				res=0;
			}
			else if(s1.charAt(m-1)==s2.charAt(n-1)){
				res = 1+findLongestCommonSubsequence(s1, s2, m-1, n-1);
			}else {
				res= Math.max(findLongestCommonSubsequence(s1, s2, m-1, n), findLongestCommonSubsequence(s1, s2, m, n-1));
			}
			memo[m][n] =res;
			return memo[m][n];
		}else {
			return memo[m][n];
		}
	}

}
