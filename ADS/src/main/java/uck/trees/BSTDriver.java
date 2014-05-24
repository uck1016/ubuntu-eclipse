package uck.trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSTDriver {

	public BSTDriver() {
		BSTOperations Obj=new BSTOperations();
		String choice=null;
		while(choice!="e"){
		choice=getChoice();
		if(choice.equals("i")){
		Obj.insert(getInput());
		}
		if(choice.equals("e")){
			System.exit(0);
		}
		else if(choice.equals("t")){
			Obj.preOrderTraversel(Obj.root);
			System.out.println("\n PostOrder\n");
			Obj.postOrderTraversel(Obj.root);
		}
		else if(choice.equals("s")){
			int x=getInput();
			if(Obj.Search(x,Obj.root))
			{
				System.out.println("Search successful: Element is "+x+"\n");
			}
			else{
				System.out.println("Element not found\n");
			}
		}
		else if(choice.equals("d")){
			int value=getInput();
			if(Obj.Search(value, Obj.root))
			{
			Obj.root=Obj.delete(value, Obj.root);
			System.out.println("Node "+ value+" successfully deleted\n");
			}
			else{
				System.out.println("Element not found\n");
			}
		}
		else if(choice.equals("a")){
			int v1=getInput();
			int v2=getInput();
			if((Obj.Search(v1, Obj.root))&&(Obj.Search(v2, Obj.root))){
			Node n1=new Node(v1);
			Node n2=new Node(v2);
			Node result=Obj.LeastCommonAncestor(n1, n2);
			if(result!=null){
				System.out.println("Lest common ancestor is "+result.key+"\n");
			}
			else{
				System.out.println("NO COMMON ANCESTOR\n");
			}
		}
			else{
				System.out.println("Elements not present in the tree \n");
			}
		}
		else if(choice.endsWith("p")){
			int preOrder[]=getElements();
			System.out.println("Postorder traversal of the tree is:\n");
			Obj.toPostOrder(preOrder);
			
		}
	}
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
	public String getChoice(){
		String input=null;
		System.out.println("\n Enter 'a' for least common ancestor\nEnter 'i' for insertion\nEnter 's' for searching a key\nEnter 'd' for deletion\nEnter 't' for traversal\nEnter 'p' for preorder to postorder conversion\nEnter 'e' for exit\n");
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
		System.out.println("Please enter the elements of the tree in preorder traversal\n");
		while(i<size){
			val=getInput();
			preOrder[i++]=val;
		}
		return preOrder;
	}

	}


