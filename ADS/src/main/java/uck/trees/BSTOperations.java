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
		Node temp,temp1, higher, lower;
		temp= temp1=root;
		if(isEmpty()){
			return null;
		}
		if(!notParent(root,n1,n2)||n1.equals(root)||n2.equals(root)){
			return null;
		}
		if(n1.key>root.key && n2.key>root.key){
			return root;
		}
		else if(n1.key<root.key && n2.key<root.key){
			if(n1.key>n2.key){
				higher= n1;
				lower=n2;
			}
			else if(n1.key<n2.key){
				higher=n2;
				lower=n1;
			}
			else{
				higher=lower=n1;
			}
			while(notParent(temp,n1,n2)){
				temp1=temp;
				if(lower.key>temp.key){
					break;
				}
				else if(higher.key<temp.key){
					temp=temp.left;
				}
				else{
					break;
				}
			}	
		}
		return temp1;
	}
	private boolean notParent(Node temp, Node n1, Node n2) {
		
		Node lt,rt;
		lt=temp.left;
		rt=temp.right;
		if(lt!=null){
		if(lt.equals(n1)||lt.equals(n2)){
			return false;
		}
		}
		if(rt!=null){
			if(rt.equals(n1)||rt.equals(n2)){
				return false;
			}
		}
		return true;
	}
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}

}
