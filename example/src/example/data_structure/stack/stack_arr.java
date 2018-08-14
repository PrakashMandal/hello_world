package example.data_structure.stack;
 
public class stack_arr{
	private int[] stack;
	int size,top;
	stack_arr(int size){
		stack=new int[size];
		this.size=size;
		top=-1;
	}
	int get_size() {return size;}
	int get_top() {return top;}
	void inqueue(int n) {
		if(top == -1) {
			top++;
			stack[top]=n;
		}
		else if(top<=size-1) {
			top++;
			stack[top]=n;
		}
		else System.out.print("Stack full");		
	}
	void dequeue() {
		stack[top]=0;
		top--;
	}
	void print() {
		for(int i=0;i<top;i++)
			System.out.print(stack[i]+" ");
		System.out.println("");
	}
}
