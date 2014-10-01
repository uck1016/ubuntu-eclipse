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
		/*ReverseSingleLinkedList Obj=new ReverseSingleLinkedList();
		IO.printInt(Obj.digitToChar('a'));
		IO.printInt('0');
		IO.printInt('1');
		IO.printInt('9');*/
		//MaxSumCircularSubArray sObj=new MaxSumCircularSubArray();
		//MaxSumRectangleIn2DArray sObj=new MaxSumRectangleIn2DArray();
		SingleLinkedList sObj=new SingleLinkedList();
		sObj.insertItem(3);
		sObj.insertItem(5);
		sObj.insertItem(10);
		sObj.insertItem(10);
		sObj.insertItem(15);
		sObj.insertItem(17);
		sObj.insertItem(18);
		sObj.insertItem(10);
		sObj.insertItem(20);
		sObj.insertItem(25);
		sObj.insertItem(5);
		sObj.traverse();
		//sObj.findMiddleElement();*/
		//sObj.deleteItem(18);
		sObj.removeDuplicates();
		IO.print("After removing duplicates");
		sObj.traverse();
		//LongestCommonSubsequence lObj=new LongestCommonSubsequence();
		//LargestIncreasingSubSequence LIObj=new LargestIncreasingSubSequence();
	}

}
