package sorting;

import java.util.Arrays;

class Point implements Comparable<Point> {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		return this.x - p.x;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}

public class CustomSortingUsingComparable {

	public static void main(String[] args) {

		Point arr[] = { new Point(10, 20), new Point(3, 12), new Point(5, 7) };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			Point p = arr[i];
			System.out.println(p.x + "," + p.y);
		}

	}

}
