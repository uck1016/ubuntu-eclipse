package uck.miscellaneous;

public class LongestCommonSubsequence {
	StandardIO IO=new StandardIO();
	int[] s1;
	int[] s2;
	int[][] store;
	int length, length2;
	public LongestCommonSubsequence(){
		IO.print("Enter the length of the first sequence");
		length=IO.getInt();
		s1=new int[length];
		for(int i=0;i<length;i++){
			IO.print("Enter the first sequence elements");
			s1[i]=IO.getInt();
		}
		IO.print("Enter the length of the second sequence");
		length2=IO.getInt();
		s2=new int[length2];
		for(int i=0;i<length2;i++){
			IO.print("Enter the second sequence elements");
			s2[i]=IO.getInt();
		}
		findSequence(s1,s2);
		IO.print("the longest common subsequence is");
		int k=length-1;
		int l=length2-1;
		printSequence(store, k, l);
	}
	private void printSequence(int[][] store, int i, int j) {
		if(i>=0&&j>=0){
		if(s1[i]==s2[j]){
			printSequence(store,i-1,j-1);
			IO.printInt(s1[i]);
		}
		else if(s1[i-1]==s2[j]){
			printSequence(store,i-1,j);
		}		
		else {
			printSequence(store,i,j-1);
		}	
		}
	}
	private void findSequence(int[] s1, int[] s2) {
		int m=s1.length;
		int n=s2.length;
		int p=Integer.MIN_VALUE;
		IO.printInt(m);
		IO.printInt(n);
		store=new int[m][n];
		for(int i=1;i<m;i++){
			store[i][0]=0;
			//IO.printInt(s1[i]);
		}
		for(int j=0;j<n;j++){
			store[0][j]=0;
		}
		for(int i=1;i<length;i++){
			for(int j=1;j<length2;j++){
				//IO.printInt(s2[j]);
				if(s1[i]==s2[j]){					
					store[i][j]=store[i-1][j-1]+1;
				}
				else if(store[i-1][j]>=store[i][j-1]){
					store[i][j]=store[i-1][j];
				}
				else{
					store[i][j]=store[i][j-1];
				}
			}
		}
		IO.print("the store elements are");
		for(int i=0;i<length;i++){
			IO.print("");
			for(int j=0;j<length2;j++){
				System.out.print(store[i][j]+" ");
			}
		}
		
	}
	

}
