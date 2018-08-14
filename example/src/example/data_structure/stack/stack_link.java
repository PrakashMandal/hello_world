package example.data_structure.stack;

import example.data_structure.Node;
import example.data_structure.linkList;

//import dataStructure.linkList;

public class stack_link{
	private linkList list;
	int top,size;
	public stack_link(int s){
		list =new linkList();
		size=s;
		top=-1;
	}
	boolean isEmpty(){
		if(top == (-1))
			return true;
		return false;
	}
	boolean isFull(){
		if(top == (size-1))
			return true;
		return false;
	}
	public int getSize() {
		return size;
	}
	public void inqueue(int d){
		if(top == -1){
			list.insert(d);
			top++;
		}
		else if(!isFull()){			
			list.insert(d);
			top++;
		}
		else
			System.out.print("Stack Full");
	}
	public void dequeue(){
		if(!isEmpty()){
			Node n = list.isLast();
			list.delete_last(n.getData());
			top--;
		}
		else
			System.out.print("Stack Empty");
	}
	public void print(){
		list.print();
	}
	public void reverse() {
		// TODO Auto-generated method stub
		list.reverse(list.getHead());
	}
}