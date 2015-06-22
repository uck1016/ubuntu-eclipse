
package uck.miscellaneous;
import uck.standard.utilities.*;

public class SingleLinkedList {
	StandardIO IO=new StandardIO();
	Node head;
public boolean insertItem(int i){
	Node v=new Node(i);
	if(head==null){
	head =v;
	}
	else{
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=v;
	}
	return true;
	
}
public void traverse(){
	Node temp=head;
	while(temp.next!=null){
		IO.printInt(temp.item);
		temp=temp.next;
	}
	IO.printInt(temp.item);
}
public void findMiddleElement() {
	Node temp=head;
	Node middle=null, inr;
	int count=0;
	int i=0;
	while(temp.next!=null){
		i=0;
		middle=temp;
		count++;
		inr=temp;
		while(i<=count){
			if(inr.next!=null){
				i++;
				inr=inr.next;
			}
			else{
				break;
			}
		}
		if(i<=count){
			break;
		}
		temp=temp.next;
	}
	IO.print("Middle element is");
	IO.printInt(middle.item);
}
public void deleteItem(int i){
	Node temp=head;
	while(temp.next!=null){
		Node next=temp.next;
		if(next.item==i){
			temp.next=next.next;
			break;
		}
		temp=temp.next;
	}
}
public void removeDuplicates(){
	Node temp=head;
	while(temp.next!=null){
		Node newNode=temp;
		while(newNode.next!=null){
			if(newNode.next.item==temp.item){
				newNode.next=newNode.next.next;
			}else{
			newNode=newNode.next;
		}
		}
		temp=temp.next;
	}
}
}
