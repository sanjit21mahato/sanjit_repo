package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByName {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Mahesh");
		names.add("Ganesh");
		sortUsingJava8(names);

	}

	private static void sortUsingJava8(List<String> names) {
		
		Collections.sort(names, (s1,s2)->s1.compareTo(s2));
		System.out.println(names);
		
	}

}
