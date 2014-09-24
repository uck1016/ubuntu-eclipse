package uck.miscellaneous;

import uck.standard.utilities.*;

public class Driver {

	/**
	 * @param args
	 */
	StandardIO IO=new StandardIO();
	public static void main(String[] args) {
		 
		Driver Obj=new Driver();
		Obj.run();

	}
	public void run(){
		//MaxSumCircularSubArray sObj=new MaxSumCircularSubArray();
		//MaxSumRectangleIn2DArray sObj=new MaxSumRectangleIn2DArray();
		SingleLinkedList sObj=new SingleLinkedList();
		sObj.insertItem(3);
		sObj.insertItem(5);
		sObj.insertItem(10);
		sObj.insertItem(15);
		sObj.insertItem(17);
		sObj.insertItem(18);
		sObj.insertItem(20);
		sObj.insertItem(25);
		sObj.traverse();
		sObj.findMiddleElement();
		//LongestCommonSubsequence lObj=new LongestCommonSubsequence();
		//LargestIncreasingSubSequence LIObj=new LargestIncreasingSubSequence();
	}

}
