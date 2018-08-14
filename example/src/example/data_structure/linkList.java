package example.data_structure;

public class linkList{
	private Node head=null;
	int size;

	public void insert(int d){
		Node n = new Node(d);
		if(getHead() == null){
			n.next=null;
			setHead(n);
		}
		else{
			Node prev=isLast();
			prev.next=n;
			n.next=null;
		}
	}
	public void delete_first() {
		Node n=getHead();
		setHead(n.next);
	}
	public void delete_last(int d){
		Node n=getHead();
		Node prev = getHead().next;
		while(prev != null){
			if(prev.getData() == d){
				break;
			}
			n=n.next;
			prev=prev.next;
		}
		n.next=prev.next;
	}
	public void reverse(Node head) {
		Node curr=null,temp = head,prev=null;
		while(temp!=null) {
			curr = temp.next;
			temp.next = prev;
			prev = temp;
			temp = curr;
		}
		this.head = head;		
	}
	public Node isLast(){
		Node n=getHead();
		while(n.next != null)
			n=n.next;
		return n;
	}
	public void print(){
		Node n=getHead();
		size=0;
		System.out.print("\nElements : ");
		while(n != null){
			System.out.print(n.getData()+" ");
			n=n.next;
			size++;
		}
		System.out.print("\n"+size+"\n");
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
}