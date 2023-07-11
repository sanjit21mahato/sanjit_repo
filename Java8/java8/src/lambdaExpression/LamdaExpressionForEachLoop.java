package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionForEachLoop {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Mahesh");
		names.add("Ganesh");
		
		names.forEach(n->{System.out.println(n);});

	}

}
