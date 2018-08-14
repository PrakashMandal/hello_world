package example.data_structure.stack;

import java.util.Scanner;

public class Stack_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=sc.nextInt();
		stack_arr s=new stack_arr(n);
		s.print();
		sc.close();
	}
}