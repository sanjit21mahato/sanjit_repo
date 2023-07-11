package searching.basic;

/*Find index of searched element in infinite sorted array
i/p: {1,5,10,40,100,200,500,....}
x= 100
O/P: 7

i/p: {3,7,10,25,....,....}
x= 15
O/P: -1

When you initialize Java arrays with the new keyword, the size argument is of type int. 
The 32-bit Java int can go to a maximum of 2,147,483,647 (2 to power 31) 
so that is the theoretical maximum Java array size

We can not declare infinte size array in java practically so we would declare array with given elements 
but write program so that it would work for infinte array 

Solution1 : O(position of the element)

It can also be done in O(log Position)

Solution2:  
*/

public class SearchInInfiniteSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 10, 40, 100, 200, 500, 1000, 1500 };
		int searchedElement = 260;
		/*Solution1 
		int res = search(arr, searchedElement);*/
		
		int res= searchElement(arr,searchedElement);
		System.out.println(res);

	}
    
	private static int searchElement(int[] arr, int searchedElement) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int search(int[] arr, int searchedElement) {
		int i = 0;
		while (true) {
			if (arr[i] == searchedElement) {
				return i;
			}
			if (arr[i] > searchedElement) {
				return -1;
			}
			i++;
		}

	}

}
