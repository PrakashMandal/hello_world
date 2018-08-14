package example.data_structure.queue;

import example.data_structure.Node;
import example.data_structure.linkList;

public class queue_link {
	private linkList L;
	private int size;
	int rear,front;
	public queue_link(int size) {
		// TODO Auto-generated constructor stub
		L=new linkList();
		this.size=size;
		rear = front = -1;
	}
	boolean isEmpty(){
		if(front>rear)
			return true;
		return false;
	}
	boolean isFull(){
		if((rear-front)+1 == size)
			return true;
		return false;
	}
	public void inqueue(int d){
		if(!isFull()) {
			L.insert(d);
			rear++;
		}
		else
			System.out.print("Queue Full");
	}
	public void dequeue(){
		if(!isEmpty()){
			L.delete_first();
			front++;
		}
		else
			System.out.print("Stack Empty");
	}
	public void print(){
		L.print();
	}
}
