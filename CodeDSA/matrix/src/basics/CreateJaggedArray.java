package basics;

public class CreateJaggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[4][];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
