package difficult;

/*
I/P : "You love coding";
O/P:  "coding love You";

You love coding
uoY evol gnidoc
coding love You

Two solutions
1>With Auxillary Space 
2>With Constant Auxillary space O(1)

here assumption is there is single space between words

*/
public class ReverseWordsInString_7 {

	public static void main(String[] args) {
		String s1 = "You love coding";
		/*String res = reverseWordsInStringWithAuxillarySpace(s1);
		System.out.println(res);*/
		reverseWordsInString(s1.toCharArray());
		//System.out.println(s1);

	}
    //This solutions takes auxillay space 
	private static String reverseWordsInStringWithAuxillarySpace(String s1) {
		String arr[]= s1.split(" ");
		int n = arr.length;
		String res ="";
		for(int i=n-1;i>=0;i--){
			res=res+arr[i] + " ";
		}
		return res;
	}

	private static void reverseWordsInString(char str []) {
        int n= str.length;
		int start=0;
		for(int end=0; end<=n-1;end++) {
			if(str[end] == ' '){
				reverse(str, start, end-1);
				start = end+1;
			}
			
		}
		//explicitly reversing the last word since for last word we may not find space
		reverse(str,start,n-1);
		//reverse the whole string
		reverse(str,0,n-1);
		System.out.println(str);
		
	}
	private static void reverse(char str[], int start, int end) {
		while(start<end) {
			char temp = str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
	}

}
