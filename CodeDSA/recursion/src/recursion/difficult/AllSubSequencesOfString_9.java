package recursion.difficult;

/*Str: ABC
O/P: "", C, B, BC, A, AC, AB, ABC
*/

public class AllSubSequencesOfString_9 {

	public static void main(String[] args) {
		String s = "ABC";
		//printSubSets(s);
		printSubSets(s,"",0);
		//print(s, "");

	}
	//without using recursion
	/*private static void printSubSets(String s) {
        System.out.println("");
		for (int i = 0; i < s.length(); i++) {
			for(int j=i+1;j<=s.length();j++){
				System.out.println(s.substring(i, j));
			}
		}

	}*/

	private static void printSubSets(String s, String current, int i) {
		
		if(s.length()==i){
			System.out.println(current);
			return;
		}
		//not include character
		printSubSets(s,current,i+1);
		//include character
		printSubSets(s,current+s.charAt(i),i+1);
		
	}
	
	 private static void print(String s, String substring) {
			if(s.length()==0){
				System.out.println(substring);
				return;
			}
			//include character
			print(s.substring(1),substring+ s.charAt(0));
			//not include character
			print(s.substring(1),substring);
			
		}

}
