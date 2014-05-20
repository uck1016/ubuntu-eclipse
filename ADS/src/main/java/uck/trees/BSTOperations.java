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
	public Node delete(int x, Node root){
		Node temp, p,q;
		if(root==null){ 
			System.out.println("tree is empty\n");
			return null;
		}
		else if(x==root.key){
			Node lt,rt;
			lt=root.left;
			rt=root.right;
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
				while(p.left!=null){
					p=p.left;
				}
				p.left=lt;
				return temp;
			}
		}
		if(x<root.key){
			q= delete(x, root.left);
			root.left=q;
		}
		else{
			q=delete(x,root.right);
			root.right=q;
		}
		return root;
	}

}
