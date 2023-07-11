package basics;

import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

/*
Given a binary heap with one possible violation,
fix the heap

Heapify is one function and 
extractMin is another function in which min is removed from Binary Heap and then Binary Heap
is rearranged to get heapify.


*/
public class MinHeapifyAndExtractMin {
	
	static int smmalest = Integer.MIN_VALUE;

	public static void main(String[] args) {

		
		MinHeap mh = new MinHeap(10);
		
		mh.insert(10);
		mh.insert(20);
		mh.insert(30);
		mh.insert(35);
		mh.insert(25);
		mh.insert(80);
		mh.insert(32);
		mh.insert(100);
		mh.insert(70);
		mh.arr[0] = 40;
	
		System.out.println(Arrays.toString(mh.arr));
		
		minHeapify(mh,0);
		System.out.println(Arrays.toString(mh.arr));
		
		int min =extractMin(mh);
		System.out.println(min);
		System.out.println(Arrays.toString(mh.arr));
		
	}
	
	private static void minHeapify(MinHeap mh, int i) {
		
		int arr[] = mh.arr;
        int l = (2*i)+1;
        int r = (2*i)+2;
        smmalest = i;
        if(l < mh.size &&  arr[i]>arr[l]) {
        	smmalest = l;
        }
        if(r <mh.size && arr[r]<arr[smmalest]) {
        	smmalest = r;
        }
        if(smmalest!= i) {
         int temp = arr[i];
         arr[i] = arr[smmalest];
         arr[smmalest] = temp;
         minHeapify(mh,smmalest);
        
        }
		
	}
	
	private static int extractMin(MinHeap mh) {
		int min = Integer.MIN_VALUE;
		if(mh.size ==0) {
			return min;
		}
		if(mh.size>=1){
		 min = mh.arr[0];
		}
		//swap min with last element of the arr
		int arr[] = mh.arr;
		int temp = min;
		arr[0] = arr[mh.size-1];
		arr[mh.size-1] = temp;
		mh.size--;
		minHeapify(mh,0);
		return min;
	}

}
