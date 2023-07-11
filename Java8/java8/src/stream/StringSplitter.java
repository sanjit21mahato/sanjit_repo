package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSplitter {

	public static void main(String[] args) {
		String str= "Ramesh,Suresh,Mahesh";
        List<String>splitStringList=   Arrays.stream(str.split(",")).collect(Collectors.toList());
        splitStringList.forEach(s->System.out.println(s));
        splitStringList.forEach(System.out::println);

	}

}
