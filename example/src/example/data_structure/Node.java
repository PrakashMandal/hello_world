package example.data_structure;

public class Node{
	public int data;
	public Node next;

	Node(int data){
		this.setData(data);
		next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}