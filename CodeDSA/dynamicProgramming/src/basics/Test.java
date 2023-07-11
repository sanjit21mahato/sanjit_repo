package basics;

import java.util.Arrays;

public class Test {
	 static int n =5;
	 static int mem[]=new int[n+1];
	public static void main(String[] args) {

    /* for(int i=0;i<=n;i++){
    	 mem[i]=-1;
     }*/
     Arrays.fill(mem, -1);
     int fact = fac(1);	 
     System.out.println(fact);
	}

	private static int fac(int n) {
		
		if(n>5){
			return 1;
		}else {
			return n*fac(n+1);
		}
		
		
		
	}
	
}
