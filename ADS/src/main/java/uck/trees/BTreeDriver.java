package uck.trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BTreeDriver {
	public static final int MIN=-99;
	public static final int MAX=9999;
	public BTreeDriver() {
		BinaryTreeOperations Obj=new BinaryTreeOperations();
		String choice=null;
		while(choice!="e"){
		choice=getChoice();
		if(choice.equals("c")){
		System.out.println("Please Enter the elements in in-order traversal\n");
		int inOrder[]=getElements();
		System.out.println("Please Enter the elements in pre-order traversal\n");
		int preOrder[]=getElements();
		Node head=Obj.constructTree(inOrder, preOrder);
		if(head!=null){
			System.out.println("Tree contruction successfull\n the pre-Order traversal is :\n");
			Obj.preOrderTraversal(head);
		}
		}
		else if(choice.equals("e")){
			System.exit(0);
		}
		else if(choice.equals("s")){
			Obj.search(new Node(getInput()), Obj.root);
		}
		else if(choice.equalsIgnoreCase("ck")){
			if(Obj.check(Obj.root, MIN, MAX)){
				System.out.println("True, it is a binary search tree");
			}
			else{
				System.out.println("False, it is NOT a binary Search tree");
			}
		}
		else if(choice.equals("h")){
			int height=Obj.height(Obj.root);
			System.out.println("Height of the tree is:"+height);
		}
		else if(choice.equalsIgnoreCase("f")){
			Obj.findLeaves(Obj.root);
		}
		else if(choice.equalsIgnoreCase("a")){
			Node lca=Obj.leastCommonAncestor(new Node(getInput()), new Node(getInput()), Obj.root);
		    if(lca!=null){
		    	System.out.println("the least common ancestor is"+ lca.key);
		    }
		    else{
		    	System.out.println("NO COMMON ANCESTOR");
		    }
		}
		else if(choice.equalsIgnoreCase("d")){
			int diameter=Obj.diameter();
			System.out.println("the diameter of the binary tree is:"+ diameter);
		}
	}

}
	public String getChoice(){
		String input=null;
		System.out.println("\nEnter 'c' for Binary tree construction\n"
				+ "Enter 'a' for Least common ancestor\n"
				+ "Enter 'ck' to check whether the tree is a Binary search tree or not\n"
				+ "Enter 's' to search for a node\n"
				+ "Enter 'a' to find least common ancestor\n"
				+ "Enter 'h' to calculate the height of the tree\n"
				+ "Enter 't' for traversal\n"
				+ "Enter 'd' to calculate the diameter of the tree\n"
				+ "Enter 'f' to find leaf nodes\n"
				+ "Enter 'e' to exit\n");
		System.out.println("Please enter your choice");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			 input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return input;
	}
	public int[] getElements(){
		System.out.println("enter the size of the tree\n");
		int size=getInput();
		int preOrder[]=new int[size];
		int val=0, i=0;
		System.out.println("Enter the elements one by one");
		while(i<size){
			val=getInput();
			preOrder[i++]=val;
		}
		return preOrder;
	}
	public int getInput(){
		int value=0;
		System.out.println("Please enter the value\n");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			 value=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
