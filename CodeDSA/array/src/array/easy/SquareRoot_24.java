package array.easy;

public class SquareRoot_24 {

	public static void main(String[] args) {
		int n = 134;
		int leftIndex = 0;
		int rightIndex= n;
		//int squareRoot= findSquareRoot(n, leftIndex, rightIndex);
		int squareRoot = findSquareRootIterative(n);
		if(squareRoot==-1){
			System.out.println("No perfercct square root");
		}else {
			System.out.println(squareRoot);
		}
        //System.out.println(squareRoot);
	}

	private static int findSquareRootIterative(int n) {
		for(int i=0;i<n/2;i++){
			if(i*i==n)return i;
			else if(i*i>n)return -1;
		}
		return -1;
	}

	private static int findSquareRoot(int n, int leftIndex, int rightIndex) {
		
		int middle = (leftIndex+rightIndex)/2;
		
		if(leftIndex>rightIndex){
			return -1;
		}
		if(middle*middle == n)
			return middle;
		
		if(middle*middle>n)
			rightIndex = middle-1;
		else 
			leftIndex = middle+1;
		return findSquareRoot(n,leftIndex,rightIndex );
	}

}
