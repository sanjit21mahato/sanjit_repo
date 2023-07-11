package basics;

import java.util.HashMap;
import java.util.Map;

public class ImolementChainingWithLinkedList {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(10, map.getOrDefault(10, 0)+1);

	}

}
