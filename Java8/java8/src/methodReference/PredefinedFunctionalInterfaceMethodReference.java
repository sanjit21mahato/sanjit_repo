package methodReference;

import java.util.function.BiFunction;

public class PredefinedFunctionalInterfaceMethodReference {

	public static int add(int a,int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> biFunction =
				PredefinedFunctionalInterfaceMethodReference::add;
		int result =biFunction.apply(10, 20);
		System.out.println(result);

	}

}
