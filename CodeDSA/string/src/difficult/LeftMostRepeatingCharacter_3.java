package difficult;

/*
 * Find the index or character of left most repeating 
I/P: s1= "geeksforgeeks";
O/P : index of g -- 0

Again two solutions:
1. Using LinkedHashMap since it maintains insertion order
2. Using ASCII values
*/
public class LeftMostRepeatingCharacter_3 {

	public static void main(String[] args) {
		String s1= "gbcdedeksforeeks";
		int res = findLeftMostRepeatingCharacter(s1);
        System.out.println(s1.charAt(res));
	}

	private static int findLeftMostRepeatingCharacter(String s1) {
       int count[] = new int[26];
       for(int i=0;i<s1.length();i++){
    	   count[s1.charAt(i)-'a']++;
       }
       int i;
	   for(i=0; i<s1.length();i++){
		 if(count[s1.charAt(i)-'a']>1){
			 break;
		 }
	   }
	   return i;
	}

}
