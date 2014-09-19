package uck.miscellaneous;
import uck.standard.utilities.*;
//Given a m*n matrix with all the rows and columns sorted in increasing order.
//Search for an element with linear time complexity
public class SearchElement {
	StandardIO IO=new StandardIO();
	public boolean Search(int[][] sortedArray, int key){
		int found=0;
		int count=0;
		int r=sortedArray[0].length;
		int c=sortedArray[1].length;
		IO.printInt(r);
		IO.printInt(c);
		int i=0,k=c-1 ;
		while(i<r&&k>=0){
	    if(sortedArray[i][k]==key){
	    	count++;
	    	System.out.println("No:of comparisions is:"+count);
	    	return true;
		}
	    else if(sortedArray[i][k]<key){
	    	count++;
	    	i++;
	    }
	    else{
	    	count++;
	    	k--;
	    }
	    	
	}
		System.out.println("No:of comparisions is:"+count);
		return false;
}
}