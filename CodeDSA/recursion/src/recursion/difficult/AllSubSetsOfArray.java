package recursion.difficult;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubSetsOfArray {

	public static void main(String[] args) {

      int arr[]={1,2,3};
      List<Integer> sublist = new ArrayList<>();
      printAllSubSets(arr, 0, sublist);

	}

	private static void printAllSubSets(int[] arr, int i, List<Integer> sublist) {
       if(i == arr.length) {
    	   System.out.println(sublist);
    	   return;
       }
       
		printAllSubSets(arr,i+1,sublist);
		sublist.add(arr[i]);
		printAllSubSets(arr,i+1,sublist);
		sublist.remove(sublist.size()-1);
	}

}
