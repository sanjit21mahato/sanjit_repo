package recursion.medium;

public class FactorialTailRecursive_2 {

	public static void main(String[] args) {
		int n = 5;
		int fact = factorial(n,1);
		System.out.println(fact);
	}

	private static int factorial(int n, int i) {
		if (n == 1) {
			return i;
		}
		return factorial(n-1, n*i);
	}

}
