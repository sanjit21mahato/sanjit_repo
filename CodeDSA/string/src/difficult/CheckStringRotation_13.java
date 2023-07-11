package difficult;

/*Need to check if second string can be obtained from first string by rotating any number of times
s1 = "ABCD";
S2 = "CDAB";
O/P = Yes  
1st Rotation BCDA
2nd Rotation CDBA

s1 = "ABAB";
s2 = "ABBA";
O/P: No


Two Solutions
 1: Naive Solutions by Rotating each character of S1 one by one and comparing with s2 
 2: 
 */



public class CheckStringRotation_13 {

	public static void main(String[] args) {

       String s1 = "ABCD";
       String s2 = "CDAB";
       boolean isStringRotation = checkIfStringIsRotation(s1,s2);
       System.out.println(isStringRotation);

	}

	private static boolean checkIfStringIsRotation(String s1, String s2) {
		String s3 = s1 + s1;
		/*if (s3.contains(s2)) {
			return true;
		} else {
			return false;
		}*/
		return s3.contains(s2);
	}

}
