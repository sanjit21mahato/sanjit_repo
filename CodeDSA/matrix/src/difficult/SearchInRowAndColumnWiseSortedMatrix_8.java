package difficult;

/*Matrix is rowwise sorted and column wise sorted
arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

search x=29;
O/P: at index [2],[1]

Naive Solution using two loops O(r*c)
Efficient solution: tricky one O(r+c) so linear
1. Begin from top right corner
2. if x matches return
3. if x is smaller move left
4. if x is greater move right 

*/


public class SearchInRowAndColumnWiseSortedMatrix_8 {

	public static void main(String[] args) {
		int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		int searchedElement = 29;
		

	}

}
