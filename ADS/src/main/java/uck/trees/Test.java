package uck.trees;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		
		 Test object = new Test();
		 object.run();

	}
	public void run()
	{
		int select=-1;
		while(select !=0){
			select=getChoice();
			if(select==1){
				BSTDriver bstObject=new BSTDriver();
			}
			else if(select==2){
				BTreeDriver bTreeObject=new BTreeDriver();
			}
			else if(select==0){
				System.exit(0);
			}
			
		}
}
	public int getChoice(){
		String input=null;
		System.out.println("\nEnter '1' for Binary Search tree Operations\nEnter '2' for Binary tree operations\nEnter '0' for exit\n");
		System.out.println("Please enter your choice");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			 input=br.readLine().trim();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Integer.parseInt(input);
}
	
}