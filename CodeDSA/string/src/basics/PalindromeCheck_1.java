package basics;

public class PalindromeCheck_1 {

	public static void main(String[] args) {

		String str = "abcecba";
		System.out.println(checkPalindrom(str));
		//Another solution Reverse string and check if both string is equal
		System.out.println(checkPalindromeByReversing(str));
		

	}
	
	private static boolean checkPalindromeByReversing(String str) {
        String originalString = str;
        String reverseString = reverseString(str);
        if(originalString.equals(reverseString)){
        	return true;
        }
		return false;
	}

	private static String reverseString(String str) {
		String rev ="";
		for(int i=str.length()-1; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		return rev;
	}

	private static boolean checkPalindrom(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
