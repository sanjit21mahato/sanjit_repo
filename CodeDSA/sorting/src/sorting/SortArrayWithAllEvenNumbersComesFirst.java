package sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
 * int arr[] = {1,4,9,5,3,2};

O/P: 4,2,1,9,5,3
*/
class EvenOddComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1%2 -o2%2;
	}
}

public class SortArrayWithAllEvenNumbersComesFirst {

	public static void main(String[] args) {

     Integer arr[] = {1,4,9,5,3,2};
     
     Arrays.sort(arr, new EvenOddComparator());
     
     System.out.println(Arrays.toString(arr));

	}

}
