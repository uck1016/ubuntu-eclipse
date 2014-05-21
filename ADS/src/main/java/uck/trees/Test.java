package uck.trees;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		
		 Test object = new Test();
		 object.run();

	}
	public void run()
	{
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
			Obj.inOrderTraversel(Obj.root);
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
		System.out.println("\n Enter 'a' for least common ancestor\nEnter 'i' for insertion\nEnter 's' for searching a key\nEnter 'd' for deletion\nEnter 't' for traversal\nEnter 'e' for exit\n");
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

}
