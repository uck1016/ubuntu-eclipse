package uck.trees;

public class BinaryTreeOperations {
	Node root;
	public Node constructTree(int[] inOrder, int[] preOrder){
		int j,k;
		int[] index=new int[preOrder.length]; 
		if(inOrder.length==0|| preOrder.length==0){
		return null;
		}
		 for(j=0;j<preOrder.length;j++){
			 for(k=0;k<inOrder.length;k++){
				 if(preOrder[j]==inOrder[k]){
				 index[j]=k;
				 break;
				 }
			 }
		 }
		 root=construct(index, inOrder);
		return root;
	}
	public void preOrderTraversal(Node n1){
		if(n1!=null){
		System.out.println(n1.key);
		preOrderTraversal(n1.left);
		preOrderTraversal(n1.right);
		}
	}
	public Node construct(int[] index, int[] inOrder){
		int l=0, r=0;
		Node newNode=new Node(inOrder[index[0]]);
		for(int i=1;i<index.length;i++){
			if(index[i]<=index[0]){
				l++;
			}
			else{
				r++;
			}
		}
		int leftArray[]=new int[l];
		int rightArray[]=new int[r];
		l=r=0;
		for(int i=1;i<index.length;i++){
			if(index[i]<=index[0]){
				leftArray[l++]=index[i];
			}
			else{
				rightArray[r++]=index[i];
			}
		}
		if(leftArray.length==1){
			newNode.left=new Node(inOrder[leftArray[0]]);
		}
		else if(leftArray.length!=0){
		newNode.left=construct(leftArray, inOrder);
		}
		if(rightArray.length==1){
			newNode.right=new Node(inOrder[rightArray[0]]);
		}
		else if(rightArray.length!=0){
		newNode.right=construct(rightArray, inOrder);
		}
		return newNode;		
	}
	public void search(Node node, Node head){
		if(head!=null){
			if(head.equals(node)){
				System.out.println("element found");
			}
			 search(node, head.left);
			 search(node, head.right);
		}
	}
	public boolean check(Node head, int min, int max){
		if(head!=null){
			if(head.left!=null){
				if(!((head.left.key<=head.key)&&(head.left.key>=min))){
					return false;
				}
	
			}
			if(head.right!=null){
				if(!((head.right.key>=head.key)&&(head.right.key<=max))){
					return false;
				}
			}
			return (check(head.left, min, head.key) && check(head.right, head.key, max));
		}
		return true;
	
	
	}
	public int height(Node head){
		if(head==null){
			return -1;
		}
		return max(height(head.left), height(head.right))+1;
	}
	private int max(int height, int height2) {
        if(height>height2){
        	return height;
        }
        else if(height<height2){
        	return height2;
        }
        else
        {
        	return height;
        }
	}
	public void findLeaves(Node head){
		if(head!=null){
			if(head.left==null&&head.right==null){
				System.out.println(head.key+"\n");
			}
			findLeaves(head.left);
			findLeaves(head.right);
			}
		}
	public Node leastCommonAncestor(Node n1, Node n2, Node head){
		Node temp=head;
		if(head==null){
			return null;
		}
		if(n1.equals(temp)||n2.equals(temp)){
			return temp;
		}
		Node lca_left=leastCommonAncestor(n1,n2,temp.left);
		Node lca_right=leastCommonAncestor(n1,n2,temp.right);
		if(lca_left!=null&&lca_right!=null){
			return temp;
		}
		if(lca_left!=null){
			return lca_left;
		}
		else{
			return lca_right;
		}
		
	}
}

