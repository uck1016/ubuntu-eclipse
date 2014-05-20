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
			Node x=Obj.Search(getInput(),Obj.root);
			if(x==null){
				System.out.println("Element not found\n");
			}
			else{
				System.out.println("Search successful: Element is "+ x.key+"\n");
			}
		}
		else if(choice.equals("d")){
			int value=getInput();
			Node t=Obj.Search(value, Obj.root);
			if(t!=null){
			Obj.root=Obj.delete(value, Obj.root);
			System.out.println("Node "+ value+" successfully deleted\n");
			}
			else{
				System.out.println("Element not found\n");
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
		System.out.println("\n Enter 'i' for insertion\nEnter 's' for searching a key\nEnter 'd' for deletion\nEnter 't' for traversal\nEnter 'e' for exit\n");
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
