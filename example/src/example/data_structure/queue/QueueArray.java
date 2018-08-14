package example.data_structure.queue;
import java.util.Scanner;

public class QueueArray{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		queue Q = new queue(n);
		for(int i=0;i<n;i++){
			int j=sc.nextInt();
			Q.inqueue(j);
		}
		for(int i=0;i<=n;i++)
			System.out.println(Q.dequeue());
	}
}