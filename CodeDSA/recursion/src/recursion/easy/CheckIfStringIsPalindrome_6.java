package recursion.easy;

public class CheckIfStringIsPalindrome_6 {

	public static void main(String[] args) {
		String s = "abcba";
		int l = 0;
		int r = s.length() - 1;
		boolean isPalindrome = true;
		isPalindrome = checkIfPalindrome(s, l, r);
		System.out.println(isPalindrome);

	}

	private static boolean checkIfPalindrome(String s, int l, int r) {
		if (l > r)
			return true;
		if (s.charAt(l) != s.charAt(r)) {
			return false;
		}
		return checkIfPalindrome(s, l + 1, r - 1);
		
	}
}
