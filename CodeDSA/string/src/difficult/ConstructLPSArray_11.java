package difficult;

import java.util.Arrays;

/*
LPS: Longest Prefix which is also suffix
prefix: substring starts at 0 index and ends at any index except n-1
suffix: substring starts at any index and ends at n-1 index

Need to construct LPS of all characters in a given string 
Ex: aabaaba
LPS[] = {0,1,0,1,2,3,4}

   a              aa           aab           aaba           aabaa           aabaab    
pre suf       pre   suff    pref  suff    pre    suff     pref   suff     pref   suff
    a         a     a        a     b      a       a       a      a         a     b
                    aa       aa    ab     aa      ba      aa     aa        aa    ab
                                   aab    aab     aba     aab    baa       aab   aab
                                                  aaba    aaba   abaa      aaba  baab
                                                                 aabaa     aabaa abaab
                                                                                 aabaab

So, we if see the prefix and suffix calculated find LPS for each index it comes out to be
LPS[] = {0,1,0,1,2,3,4}

Now LPS array calculation

LPS of ith index:
Lets say x = LPS[i-1]
if(str[i]==str[x]
then LPS[i] =x+1;
else
x = LPS[x-1]
and again check 
if(str[i] ==str[x]
then LPS[i] = x+1


*/
                                                   
public class ConstructLPSArray_11 {

	public static void main(String[] args) {

		String str = "aabaaba";
		int LPS[] = construcLPSArray(str);
		System.out.println(Arrays.toString(LPS));

	}

	private static int[] construcLPSArray(String str) {
		char strA[] = str.toCharArray();
		int n = str.length();
		int res[] = new int[n];
		//res[0] =0;
		for (int i = 1; i <= n-1; i++) {
			int x = res[i - 1];
			while (strA[i] != strA[x]) {
				if (x == 0) {
					x = -1;
					break;
				}
				x = res[x - 1];
			}
			res[i] = x + 1;
		}
		return res;
	}

}
