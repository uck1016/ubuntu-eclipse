package uck.trees;

public class BSTOperations {
	Node root;
	public void insert (int x)
	{
		Node newNode= new Node(x);
		Node p= root;
		Node q=null;
		while(p!=null)
		{
			q=p;
			if(newNode.key<q.key){
				p=p.left;
			}
			else{
				p=p.right;
			}
		}
		if(root==null)
		{
			root=newNode;
		}
		else if(newNode.key<q.key){
			q.left=newNode;
		}
		else {
			q.right=newNode;
		}
		System.out.println("insertion successful");
	}
	public void inOrderTraversel(Node x){
		if(x!=null){
			inOrderTraversel(x.left);
			System.out.println("\t"+x.key);
			inOrderTraversel(x.right);
		}
	}
	public void preOrderTraversel(Node x){
		if(x!=null){
			System.out.println("\t"+x.key);
			preOrderTraversel(x.left);
			preOrderTraversel(x.right);
		}
	}
	public boolean Search(int x, Node root){
		if(isEmpty()||root==null){
			return false;
		}
		if(root.key==x){
			return true;
		}
	    if(x<root.key){
			return Search(x,root.left);
		}
		else{
			return	Search(x,root.right);
		}
		}
	public Node delete(int x, Node head){
		Node temp, p,q;
		if(isEmpty()){ 
			return null;
		}
		else if(x==head.key){
			Node lt,rt;
			lt=head.left;
			rt=head.right;
			if(lt==null &&rt==null){
				System.out.println("no children\n");
				return null;
			}
			else if(rt==null){
				temp=lt;
				return temp;
			}
			else if(lt==null){
				temp=rt;
				return temp;
			}
			else{
				temp=rt;
				p=rt;
				while(temp.left!=null){
					p=temp;
					temp=temp.left;
				}
				temp.left=lt;
				p.left=null;
				return temp;
			}
		}
		if(x<head.key){
			q= delete(x, head.left);
			head.left=q;
		}
		else{
			q=delete(x,head.right);
			head.right=q;
		}
		return head;
	}
	public Node LeastCommonAncestor(Node n1, Node n2){
		Node temp,temp1;
		temp=root;
		int found=0;
		if(isEmpty()){
			return null;
		}
		while(found!=1){
		if(n1.key>temp.key && n2.key>temp.key){
			temp=temp.right;
			continue;
		}
		else if(n1.key<temp.key && n2.key<temp.key){
			temp=temp.left;
			continue;
		}
		found=1;
	}
		return temp;
	}
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}

}
