package difficult;
/*I/P:  
1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

O/P : 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/

public class PrintMatrixinSpiralForm {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
				        { 5, 6, 7, 8 }, 
				        { 9, 10, 11, 12 }, 
				        {13, 14, 15, 16 } 
				      };
		int r =4;
		int c = 4;
		printInSpiralForm(arr,r, c);

	}

	private static void printInSpiralForm(int[][] arr, int r, int c) {

      int left = 0;
      int top = 0;
      int right = c-1;
      int bottom = r-1;
      
      while(top<=bottom && left<=right) {
    	 
    	  //left to right 
    	  for(int i =left; i<=right;i++){
    		  System.out.print(arr[top][i]+" ");
    	  }
    	  top++;
    	  
    	  //top to bottom
    	  for(int i = top; i<=bottom;i++){
    		  System.out.print(arr[i][right]+" ");
    	  }
    	  right--;
    	  
    	  //right to left
    	  for(int i =right;i>=left;i--){
    		  System.out.print(arr[bottom][i]+" ");
    	  }
    	  bottom--;
    	  //bottom to top
    	  for(int i=bottom; i>=top;i--){
    		  System.out.print(arr[i][left]+" ");
    	  }
    	  left++;
      }
     
		
	}

}
