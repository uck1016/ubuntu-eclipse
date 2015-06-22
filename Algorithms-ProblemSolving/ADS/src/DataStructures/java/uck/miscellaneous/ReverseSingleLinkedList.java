package uck.miscellaneous;

import uck.standard.utilities.StandardIO;

public class ReverseSingleLinkedList {
	StandardIO IO=new StandardIO();
	ReverseSingleLinkedList(){
		SingleLinkedList list=new SingleLinkedList();
		list.insertItem(2);
		list.insertItem(3);
		list.insertItem(4);
		list.insertItem(5);
		list.traverse();
		//reverse(list);
		reverseRecursive(list, list.head);
		list.traverse();
	} 
	//recursive method to reverse the elements of a linked list 
	private void reverseRecursive(SingleLinkedList list, Node temp) {
			if(temp.next==null){
				list.head=temp;
				return;
			}
			else{
				reverseRecursive(list, temp.next);
				Node p=temp.next;
				p.next=temp;
				temp.next=null;
			}
		
	}
	//Iterative method to reverse the elements of a linked list
	private void reverse(SingleLinkedList list) {
		Node temp, next, prev=null;
		temp=list.head;
	while(temp!=null){
		next=temp.next;
		temp.next=prev;
		prev=temp;
		temp=next;
	}
		list.head=prev;
	}
	public int digitToChar(char c){
		if(c<='0' && c<='9'){
			return c-'0';
		}else if(c>='A'&& c<='F'){
			return 10+c-'A';
		}else if(c>='a'&& c<='f'){
			return 10+c-'a';		
	}
		return -1;
	}

}
