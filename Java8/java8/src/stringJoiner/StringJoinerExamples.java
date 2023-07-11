package stringJoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExamples {

	public static void main(String[] args) {
		
		StringJoiner joiner1 = new StringJoiner(",");
		joiner1.add("Ramesh");
		joiner1.add("Mahesh");
		joiner1.add("Suresh");
		System.out.println(joiner1);
		
		StringJoiner joiner2 = new StringJoiner(",","{","}");
		joiner2.add("Ramesh");
		joiner2.add("Mahesh");
		joiner2.add("Suresh");
		System.out.println(joiner2);
		
		StringJoiner joiner3 = new StringJoiner(",","[","]");
        System.out.println(joiner3.merge(joiner2));
        
        
	}

}
