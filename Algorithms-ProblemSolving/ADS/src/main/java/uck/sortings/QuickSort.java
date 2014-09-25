package uck.sortings;

import uck.standard.utilities.StandardIO;

public class QuickSort {
	int [] inputArray;
	StandardIO IO=new StandardIO();
	QuickSort(int [] input){
		inputArray= input;
		sort(inputArray, 0, inputArray.length-1);
		IO.print("Elements after sorting are");
		for(int i=0;i<inputArray.length;i++){
			IO.printInt(inputArray[i]);
		}
	}
	public void sort(int[] inputArray, int i, int j) {
		if(i<j){
		int pivot=Partition( inputArray, i, j);
		sort(inputArray, i, pivot-1);
		sort(inputArray, pivot+1, j);
		}
	}
	public int Partition(int[] inputArray, int first, int last) {
		// TODO Auto-generated method stub
		int pivot=inputArray[last];
		int i=first-1;
		for(int j=first;j<=last-1;j++){
			if(inputArray[j]<=pivot){
				i=i+1;
				swap(i,j);	
			}
		}
		swap(i+1,last);
		return i+1;	
	}
	private void swap(int i, int j) {
		int temp=inputArray[j];
		inputArray[j]=inputArray[i];
		inputArray[i]=temp;
	}

}
