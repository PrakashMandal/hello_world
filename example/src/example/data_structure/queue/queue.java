package example.data_structure.queue;
public class queue{
	private int[] queue;
	int size,rear,front;
	queue(int size){
		queue=new int[size];
		this.size=size;
		rear=-1;
		front=-1;
	}
	int get_size() {return size;}
	void inqueue(int n) {
		if(rear<size-1) {
			rear++;
			queue[rear]=n;
		}
		else System.out.print("Queue full");		
	}
	int dequeue() {
		if(front>rear){
			System.out.println("Queue Empty");
			return -1;
		}
		else{
			front++;
			return queue[front];
		}
	}
	void print() {
		for(int i=front;i<=rear;i++)
			System.out.print(queue[i]+" ");
		System.out.println("");
	}
}
