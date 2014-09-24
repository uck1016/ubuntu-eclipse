package uck.miscellaneous;

import uck.standard.utilities.*;

public class LargestIncreasingSubSequence {

		StandardIO IO=new StandardIO();
		int[] s1;
		int[] s2;
		int[][] store;
		int length, length2;
		public LargestIncreasingSubSequence(){
			IO.print("Enter the length of the sequence");
			length=IO.getInput();
			s1=new int[length];
			for(int i=0;i<length;i++){
				IO.print("Enter the sequence elements");
				s1[i]=IO.getInput();
			}
			findSequence(s1);
			//IO.print("the longest common subsequence is");
			//int k=length-1;
			//int l=length2-1;
			//printSequence(store, k, l);
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
		private void findSequence(int[] s1) {
			int[] LS=new int[s1.length];
			LS[0]=1;
			int result=0;
			int max=1;
			for(int i=1;i<LS.length;i++){}
			
			IO.print("longest increasing sub sequence is");
			IO.printInt(max);
		}
		

	}
