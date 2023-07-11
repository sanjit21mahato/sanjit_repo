package basics;

public class CoinChangeEqualSumDP_7 {

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
