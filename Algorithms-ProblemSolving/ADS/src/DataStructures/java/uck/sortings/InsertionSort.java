package uck.sortings;

import uck.standard.utilities.StandardIO;

public class InsertionSort {
	StandardIO IO=new StandardIO();
	public void Sort(){
		int [] inputArray=IO.getArrayElements();
		int i=0;
		for(int j=1;j<inputArray.length;j++){
			i=j-1;
			int key=inputArray[j];
			while(i>=0 && key< inputArray[i]){
			   inputArray[i+1]=inputArray[i];				
			   i--;
		}
			inputArray[i+1]=key;	
	}
	for(int k=0;k<inputArray.length;k++){
		IO.printInt(inputArray[k]);
	}
	}
}
