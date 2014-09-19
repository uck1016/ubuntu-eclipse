package uck.miscellaneous;

public class MaxSumCircularSubArray {
StandardIO IO=new StandardIO();
int length=0;
int[] input; 
MaxSumCircularSubArray(){
	IO.print("Enter the Lenght of the array");
	length=IO.getInt();
	input=new int[length];
	int i=0;
	while(i<length){
	IO.print("Enter the "+i+" th Element");
	input[i]=IO.getInt();
	i++;
	}
	findMaxSum();
}
private void findMaxSum() {
int sum=0;
int max_sum=Integer.MIN_VALUE;
int start_index=0;
int end_index=-1;
int start_index_until_now=0;
int flag=0;
for(int i=0;i<length;i++){

	IO.print("**FLAG***");
	IO.printInt(flag);
	sum=sum+input[i];
	if(sum>=max_sum){
		max_sum=sum;
		start_index=start_index_until_now;
		end_index=i;
	}
	if(sum<0){
		sum=0;
		start_index_until_now=i+1;
	}
	if(i>end_index){
		if(flag==-1){
			break;
		}
	}
    if(i==length-1){
    	if(end_index==i-1){
    		sum=input[end_index]+input[i];
    		start_index_until_now=end_index;
    	}
    	else if(end_index<i-1){
    		sum=input[i];
    		start_index_until_now=i;
    	}
    	else if(end_index==i){
    		IO.print("**si=ei***");
    		sum=max_sum;
    	}
		i=-1;
	    flag=-1;
	}
}
IO.print("*********************");
IO.printInt(max_sum);
IO.printInt(start_index);
IO.printInt(end_index);	
}
}
