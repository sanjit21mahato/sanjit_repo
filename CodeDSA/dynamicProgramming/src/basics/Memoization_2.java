package basics;
/*
Lets see the exapmple of Fibbonacii 
Suppose we write a recursion fn to find nth fibbonacci number

int fibbo(int n){
	if(n==0|| n==1){
		return n;
	}else {
		fibbo(n-1)+fibb(n-2);
	}
}
Lets see recursion  tree for n=4

                  fib(4)
            fib(3)         fib(2)
      fib(2)    fib(1)   fib(1)   fib(0)        
  fib(1)  fib(0)                

Now if we see closely in this small example, there are so many places 
where the same computation is done many time times
Like fib(2), fib(1) and if n increases there will be lot more.
So in dynamic programming we will avoid these recompuations. We will some how store somewhere 
the computation and re use when required. Like for fib(2) onc ethe computation is done and again if 
need f(2) we can use it instead of computing again. So we solve every subproblem only once.
Time complexity of recursive solution exponential 
and using dynamic programming we can reduce it to linear time.

This is called Top down
*/

public class Memoization_2 {
	static int n = 5;
	static int mem[] = new int[n + 1];

	public static void main(String[] args) {
		// int fibbo = fibUsingRecursion(n);
		// System.out.println(fibbo);

		for (int i = 0; i <= n; i++) {
			mem[i] = -1;
		}
		int fib = fibboUsingMemoization(n);
		System.out.println(fib);
	}

	private static int fibboUsingMemoization(int n) {
		if (mem[n] == -1) {
			int res = 0;
			if (n == 0 || n == 1) {
				res= n;
			} else {
				res = fibboUsingMemoization(n - 1) + fibboUsingMemoization(n - 2);
			}
			mem[n] = res;

		}
		return mem[n];

	}

	/*private static int fibUsingRecursion(int n) {
         if(n==0|| n==1)return n;
        
		return fibUsingRecursion(n-1)+fibUsingRecursion(n-2);
	}*/

}
