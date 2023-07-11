package recursion.easy;

public class SumOfDigitsOfNumber_7 {

	public static void main(String[] args) {
		
		int n= 1234;
		int finalSum = findSumOfDigits(n);
		System.out.println(finalSum);

	}

	private static int findSumOfDigits(int n) {
        if(n<10)
        	return n;
		 return n%10+ findSumOfDigits(n/10);
	}

}
