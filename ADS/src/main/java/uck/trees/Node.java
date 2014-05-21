package uck.trees;

public class Node {
	int key;
	Node left, right, parent;
	Node(int x){
		key=x;
	}
		@Override
	public boolean equals(Object Obj){
			Node newNode=(Node) Obj;
			if(this.key==newNode.key){
				return true;
			}
		return false;
		
	}
		
	}

