package example.data_structure;

public class DoublyLinkList {
	Node head,tail;
	class Node{
		Node prev,next;
		int data;
		Node(int data){
			this.data = data;
			prev = null;
			next = null;
		}
	}
	public DoublyLinkList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
	}
	public Node getHead() {
		return this.head;
	}
	public Node getTail() {
		return this.tail;
	}
	public void PrintDoublyLinkList() {
		Node temp = this.getHead();
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void Reverse() {
		Node Prev=null,Curr=this.getHead(),Next;
		while(Curr!=null) {
			Next = Curr.next;
			Curr.next =Prev;
			Curr.prev = Next;
			Prev = Curr;
			Curr = Next;
		}
		this.head = Prev;
	}
	public void insert(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}
		else {
			tail.next = temp;
			temp.prev = tail;
		}
		tail = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkList d1 = new DoublyLinkList();
		for(int i=0;i<5;i++)
			d1.insert(i);
		d1.PrintDoublyLinkList();
		d1.Reverse();
		d1.PrintDoublyLinkList();
	}

}
