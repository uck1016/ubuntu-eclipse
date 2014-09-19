package uck.miscellaneous;

public class MaxSumRectangleIn2DArray {
	StandardIO IO=new StandardIO();
	int topLeft;
	int topRight;
	int bottomLeft;
	int bottomRight;
    int[][] input;
    int rows;
    int columns;
    int[] temp;
    int sum=0;
    int max_sum=Integer.MIN_VALUE;
    MaxSumRectangleIn2DArray(){
    	IO.print("Enter no:of rows");
    	rows=IO.getInt();
    	IO.print("Enter no:of columns");
    	columns=IO.getInt();
    	input=new int[rows][columns];
    	temp=new int[rows];
    	for(int i=0;i<rows;i++){
    		IO.print("Enter the "+i+"th row elements");
    		for(int j=0;j<columns;j++){
    			IO.print("Enter element");
    			input[i][j]=IO.getInt();
    		}
    	}
    	for(topLeft=0;topLeft<columns;topLeft++){
    		
    	}
    
    }
	private int findMax(int[] temp2) {
		int start_index_until_now=0;
		for(int i=0;i<rows;i++){
			sum=sum+temp2[i];
		if(sum>max_sum){
			max_sum=sum;
			topLeft=start_index_until_now;
			bottomRight=i;
		}
		if(sum<0){
			sum=0;
			start_index_until_now=i+1;
		}
		}
		IO.print("sum is "+sum+" where start is "+topLeft+" and finish is "+bottomRight);
		return sum;
	}
}
