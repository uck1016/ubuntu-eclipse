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
	public void postOrderTraversel(Node x){
		if(x!=null){
			postOrderTraversel(x.left);
			postOrderTraversel(x.right);
			System.out.println("\t"+x.key);
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
			return Search(x,root.right);
		}
		}
	public Node delete(int x, Node head){
		Node temp, p,q;
		temp=head;
		if(isEmpty()){ 
			return null;
		}
		if(x==temp.key){
			//case when X has no left and right child
			if(temp.left==null&temp.right==null){
				temp = null;
			}
			//case when X has no left child
			else if(temp.left==null){
				 temp=temp.right;
			}
			//case when X has no right child
			else if(temp.right==null){
				 temp=temp.left;
			}
			//case when X has both child's
			else{
				p=temp.right;
				while(p.left!=null){
					p=p.left;
				}
				temp.key=p.key;
				temp.right=delete(p.key, temp.right);
			}
		}else if(x<temp.key){
			temp.left=delete(x,temp.left);
		}
		else if(x>temp.key){
			temp.right=delete(x, temp.right);
		}
		return temp;
	}

	public Node LeastCommonAncestor(Node n1, Node n2){
		Node temp;
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
	public void toPostOrder(int[] preOrder) {
		int head=preOrder[0], j=0, k=0;
		int length=preOrder.length;
		for(int i=0;i<length;i++){
			if(preOrder[i]<head){
				j++;
			}
			else if(preOrder[i]>head){
				k++;
			}
		}
		int leftArray[] = new int[j];
		int rightArray[]= new int[k];
		int p=0,q=0;
		for(int i=0;i<length;i++){
			if(preOrder[i]<head){
				leftArray[p]=preOrder[i];
				p++;
			}
			else if(preOrder[i]>head){
				rightArray[q]=preOrder[i];
				q++;
			}
		}
		if(leftArray.length>1){
		toPostOrder(leftArray);
		}else if(leftArray.length==1)
		{
			System.out.println("\n"+leftArray[0]+"\n");
		}
		if(rightArray.length>1){
		toPostOrder(rightArray);
		}
		else if (rightArray.length==1){
			System.out.println("\n"+rightArray[0]+"\n");
		}
		System.out.println("\n"+head+"\n");
	}

}
