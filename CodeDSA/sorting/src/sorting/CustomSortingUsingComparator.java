package sorting;

import java.util.Arrays;
import java.util.Comparator;


class PointComparator {

	int x;
	int y;

	public PointComparator(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyComparator implements Comparator<PointComparator> {
	@Override
	public int compare(PointComparator p1, PointComparator p2) {
		
		return p1.x-p2.x;
	}
}

public class CustomSortingUsingComparator {

		public static void main(String[] args) {

			PointComparator arr[] = { new PointComparator(10, 20), new PointComparator(3, 12), new PointComparator(5, 7) };
			Arrays.sort(arr, new MyComparator());
			for (int i = 0; i < arr.length; i++) {
				PointComparator p = arr[i];
				System.out.println(p.x + "," + p.y);
			}

		}

}
