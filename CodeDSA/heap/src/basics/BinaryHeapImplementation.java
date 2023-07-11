package basics;

import java.util.Arrays;

class MinHeap {
	
	int arr[];
	int size;
	int capacity;
	
	MinHeap(int c){
		arr= new int[c];
		size=0;
		capacity = c;
	}
	
	int left(int i) {
		return (2*i+1);
	}
	int right(int i){
		return (2*i+2);
	}
	int parent(int i){
		return (i-1)/2;
	}

	public void insert(int data) {
		if(size==capacity){
			return;
		}else {
			size++;
			arr[size-1] = data;
			createHeap(size-1);
		}
		
	}

	private void createHeap(int i) {
		if(i==0)return;
		int parent = parent(i);
		while(arr[parent]>arr[i]){
			int temp = arr[parent];
			arr[parent] =arr[i];
			arr[i] =temp;
			createHeap(parent);
		}
	}
	
}

public class BinaryHeapImplementation {

	public static void main(String[] args) {
		
		//For simplicity we have created an array of capacity 10 and size 8
		MinHeap mh = new MinHeap(10);
		
		//insert 12 
		mh.insert(10);
		mh.insert(20);
		mh.insert(15);
		mh.insert(40);
		mh.insert(50);
		mh.insert(100);
		mh.insert(25);
		mh.insert(45);
		mh.insert(12);
		System.out.println(Arrays.toString(mh.arr));
		//delete
		
		

	}

}
