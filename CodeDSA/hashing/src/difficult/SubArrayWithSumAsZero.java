package difficult;

import java.util.HashSet;
import java.util.Set;

/*
 * I/P: {1,4,13,-3,-10,5};
O/P:Yes

Solve in O(n)

SubArray mean contiguous element
*/
public class SubArrayWithSumAsZero {

	public static void main(String[] args) {
		int arr[] = new int[]{1,4,13,-3,-10,5};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));

	}
	static boolean ZeroSumSubarray(int arr[], int n)
    {
        Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        for(int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];
            if(us.contains(prefix_sum) == true || prefix_sum==0)
              return true;
              
            us.add(prefix_sum);
        }
        
        return false;
    }

}
