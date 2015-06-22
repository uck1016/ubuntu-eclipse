package uck.sortings;

import uck.standard.utilities.*;

//First we a build a Max-Heap of the unordered array
//by implementing bottom up approach of Max-Heapify to the elements in linear time complexity
public class HeapSort {
	StandardIO IO=new StandardIO();
HeapSort(int[] inputArray){
	int length=inputArray.length;
	buildMaxHeap(inputArray, length);
	IO.print("Max-Heap is");
	for(int i=0;i<length;i++){
		IO.printInt(inputArray[i]);
	}
	sort(inputArray);
	IO.print("array after applying heap sort");
	for(int i=0;i<length;i++){
		IO.printInt(inputArray[i]);
	}
}
//Implementing heap sort on the max-heap that is built,
//the first element(always the root and largest in heap) is swaped with the last element 
//After the swap we call max-heapify to maintain the heap property. 
private void sort(int[] inputArray) {
	int heapSize=inputArray.length;
	for(int i=inputArray.length-1;i>=1;i--){
		int temp=inputArray[0];
		inputArray[0]=inputArray[i];
		inputArray[i]=temp;
		heapSize=heapSize-1;
		maxHeapify(inputArray, 0, heapSize);
	}
	
}
private void buildMaxHeap(int[] inputArray, int heapSize) {
	for(int i=heapSize/2;i>=0;i--){
		maxHeapify(inputArray, i, heapSize );
	}	
}
private void maxHeapify(int[] inputArray, int i, int heapSize) {
	int left=2*i+1;
	int right=left+1;
	int largest;
	
	if(left<heapSize&& inputArray[left]>inputArray[i]){
		largest=left;
	}
	else{
		largest=i;
	}
	if(right<heapSize && inputArray[right]>inputArray[largest]){
		largest=right;
	}
	if(largest!=i){
		int temp=inputArray[i];
		inputArray[i]=inputArray[largest];
		inputArray[largest]=temp;
		maxHeapify(inputArray, largest, heapSize);
	}	
}
}
