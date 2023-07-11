package basics;

/*
Binary Heap Data structure is used in Heap Sort
Binary Heap is used to implement PriorityQueue.
Priority Queues are useful in many standard algorithm like
dijkstra's shortest path algorithm
prims minimum spanning tree algorithm
huffman coding, not only this in any situation where we have items in queue and 
these items have priority we can use Priority Queue.

Heap is of Two Types :
	Min Heap ---highest priority item is assigned lowest value
and Max Heap ---highest priority item is assigned highest value

Binary Heap is complete Binary Tree(stored as an array)
Binary Tree is called complete if its all levels are completely filled
except possibly the last level and the last level has to fill from left to right

            10 
           /  \
         20    30
        /  \   /
      40  50  60
 It is stored as array {10,20,30,40,50,60}     
      
 left(i) = 2i+1     
 right(i) = 2i+2
 parent(i) = (i-1)/2
 where i is index of an array
 
 So by maintaining complete BT  gives many advantages as random access , cache friendly since itmes are at contiguous location,
 Since it is complete BT height of tree is minimum
 
 Min Heap -- is a complete BT and every node has a value smaller than its descendants
 
*/


public class HeapIntroduction {

}
