package example.data_structure.stack;

//import java.dataStructure.stack.stack_link;

public class Run{
	public static void main(String[] args) {
		stack_link s_l1 = new stack_link(5);
		for(int i=1;i<=5;i++){
			s_l1.inqueue(i);
			//System.out.print(i+".");
		}
		s_l1.print();
		s_l1.dequeue();
		s_l1.print();
		//s_l1 = s_l1.reverse(s_l1);
		s_l1.print();
	}
}