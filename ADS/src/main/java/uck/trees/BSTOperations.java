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
	public Node Search(int x, Node root){
		if(root==null||root.key==x){
			return root;
		}
	    if(x<root.key){
			System.out.println("in****");
			return Search(x,root.left);
		}
		else{
			return	Search(x,root.right);
		}
		}
	public Node delete(int x, Node head){
		Node temp, p,q;
		if(head==null){ 
			System.out.println("tree is empty\n");
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
		System.out.println("***"+head.key);
		return head;
	}

}
