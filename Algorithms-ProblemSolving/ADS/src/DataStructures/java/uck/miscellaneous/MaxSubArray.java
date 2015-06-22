/* Algorithm to find Maximum sub array of a give array
 * Technique: Divide and conquer
 * Time complexity: O(nlog(n))
 */
package uck.miscellaneous;
import uck.standard.utilities.*;
public class MaxSubArray {
	StandardIO IO=new StandardIO();
	private int l, h, sum;
	public MaxSubArray(int low, int high, int i) {
		this.l=low;
		this.h=high;
		this.sum=i;
	}
	public MaxSubArray() {
		// TODO Auto-generated constructor stub
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public MaxSubArray FindMaxSubArray(int[] input, int low, int high){
		int mid;
		MaxSubArray left=new MaxSubArray();
		MaxSubArray right=new MaxSubArray();
		MaxSubArray middle=new MaxSubArray(); 
		if(low==high){
			//IO.printInt(low);
			return new MaxSubArray(low, low,input[low]);
		}
		else{
			mid=(low+high)/2;
		    left=FindMaxSubArray(input,low,mid);
			right=FindMaxSubArray(input,mid+1,high);
			middle=CrossingMaxSubArray(input, low, mid, high);
		}
		if(left.sum>=right.sum&&left.sum>=middle.sum){
			return left;
		}
		if(right.sum>=left.sum&&right.sum>=middle.sum){
			IO.printInt(right.h);
			return right;
		}
		return middle;

}
	public MaxSubArray CrossingMaxSubArray(int[] input, int low,int mid, int high){
		MaxSubArray middle=new MaxSubArray();
		int left_sum=-9999;
		int sum=0;
		for(int i=mid;i>=low;i--){
			IO.printInt(i);
			sum=sum+input[i];
			if(sum>left_sum){
				left_sum=sum;
				middle.l=i;
			}
		}
		int right_sum=-9999;
		sum=0;
		for(int i=mid+1;i<=high;i++){
			sum=sum+input[i];
			if(sum>right_sum){
				right_sum=sum;
				middle.h=i;
			}
		}
		middle.sum=right_sum+left_sum;
		return middle;
	}
	//Kadane's algorithm to find the maximum contiguous sub-array in linear time complexity
	public void FindMaxSubArray(int l, int h, int[] input){
		int sum=0;
		int max_sum=Integer.MIN_VALUE;
		int start_index=0;
		int start_Index_Until_Now=0;
		int end_index=0;
		for(int i=l;i<input.length;i++){
			sum=sum+input[i];
			if(sum>max_sum){
				max_sum=sum;
				start_index=start_Index_Until_Now;
				end_index=i;
			}
			else if(sum<0){
				sum=0;
				start_Index_Until_Now=i+1;
				
			}
		}
		IO.print("the maximum sub-array is");
		for(int i=start_index;i<=end_index;i++){
			IO.printInt(input[i]);
		}
	}
}
