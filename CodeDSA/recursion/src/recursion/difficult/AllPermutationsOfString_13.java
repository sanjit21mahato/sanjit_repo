package recursion.difficult;


/*
I/P="ABC"
O/P="ABC","ACB","BAC","BCA","CAB","CBA"
For Length of String n, there would be !n permutations.
*/

public class AllPermutationsOfString_13 {

	public static void main(String[] args) {

     String s= "ABC";
     printAllPermutationsOfString(s,0);

	}

	private static void printAllPermutationsOfString(String s, int i) {
		
		if(i==s.length()-1){
			System.out.println(s);
			return;
		}
		for(int j=i;j<s.length();j++){
			 s= swap(s,i,j);
			 printAllPermutationsOfString(s,i+1);
			 swap(s,j,i);
		}
	}

	private static String swap(String s, int i, int j) {

    char temp= s.charAt(i);
    char tempArr[] = s.toCharArray();
    tempArr[i]= s.charAt(j);
    tempArr[j]=temp;
    return String.valueOf(tempArr);
		
	}

}
