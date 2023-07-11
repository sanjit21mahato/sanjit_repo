package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int n =5;
		print(n);
	
		
	}

	private static void print(int n) {
		
		if(n==0){
			return;
		}
		print(n-1);
		System.out.println(n);
		
	}

	

}
