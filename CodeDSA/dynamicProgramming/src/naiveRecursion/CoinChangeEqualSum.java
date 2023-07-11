package naiveRecursion;
/*
Given array of coins types with infinite supply of it and sum,
need to find the number of ways to pick coins so that sum of the coins becomes equal to sum

IP: [1,2,3];
sum =4;
OP:{1+1+1+1 , 1+1+2, 1+3, 2+2}
total of 4 combinatiosn possible.

*/
public class CoinChangeEqualSum {

	public static void main(String[] args) {

     int coins[]={1,2,3};
     int n= coins.length;
     int sum =4;
     int res = countTotalWays(coins,n,sum);
     System.out.println(res);
     
	}

	private static int countTotalWays(int[] coins, int n, int sum) {

		if(sum==0)
			return 1;
		
		if(sum<0)
			return 0;
		
		if(n==0){
			return 0;
		}
		
          
		return countTotalWays(coins, n ,sum-coins[n-1])+
		       countTotalWays(coins, n-1, sum);

	}

}
