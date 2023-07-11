package difficult;

import java.util.Arrays;

public class PatternSearchUsingKMP_12 {

	public static void main(String[] args) {

        String text = "aabaaba";
        String pattern = "aba";
        String concatedStr= pattern+"$"+text;
        System.out.println(concatedStr);
        int LPSArr[]=construcLPSArray(concatedStr);
        System.out.println(Arrays.toString(LPSArr));
        //length 3+1+7
        for(int i=0;i<=LPSArr.length-1;i++){
        	if(LPSArr[i] == pattern.length()) {
        		System.out.println(i-(pattern.length()+pattern.length()+1)+1);
        	}
        }

	}

	private static int[] construcLPSArray(String contacStr) {

		char strA[] = contacStr.toCharArray();
		int n = contacStr.length();
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
