package uck.miscellaneous;
import uck.standard.utilities.*;

public class Test {
	StandardIO IO=new StandardIO();
	public static void main(String[] args) {
		Test Obj=new Test();
		Obj.run();

	}
	public void run(){
		String choice=null;
		while(choice!="e"){
		IO.print("Enter 1 to search for an element\nEnter 2 to find the maximum sub array\nEnter e for exit\n");
		 choice=IO.getChoice();
		 if(choice.equalsIgnoreCase("2")){
			 MaxSubArray Obj=new MaxSubArray();
			 IO.print("Please enter the length of the array");
			 int length=IO.getInput();
			 int[] input=new int[length];
			 for(int i=0;i<length;i++){
				 input[i]=IO.getInput();
			 }
			 Obj.FindMaxSubArray( 0, length-1, input);
			 /*IO.print("the maximum sub array is:\n");
			 for(int i=Obj.getL();i<=Obj.getH();i++){
				 IO.printInt(input[i]);
			 }*/
			 
		 }
		 else if(choice.equalsIgnoreCase("1")){
			 IO.print("enter row size");
				int rows=IO.getInput();
				IO.print("enter column size");
				int columns=IO.getInput();
				int [][] sortedArray=getElements(rows,columns);
				IO.print("please enter the lement to search for");
				int key=IO.getInput();
				SearchElement Obj=new SearchElement();
				if(Obj.Search(sortedArray, key)){
					IO.print("Element found");
				}
				else{
					IO.print("Element not found");
				}
		 }
		 else if(choice.equalsIgnoreCase("e")){
			 System.exit(0);
		 }
		}
		
			
	}
	public int[][] getElements(int rows, int columns){
		int[][] sortedArray=new int[rows][columns];
		IO.print("please enter the row and columns elemets in incresing order");
		for(int i=0;i<rows;i++){
			IO.print("Eneter the"+i+"th row elements");
			for(int j=0;j<columns;j++){
				sortedArray[i][j]=IO.getInput();
			}
		}
		return sortedArray;
	}

}
