package example.demoException;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;float z = 0;
		try(Scanner sc=new Scanner(System.in)) {
			x=sc.nextInt();
			y=sc.nextInt();
			z=(float)x/y;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println(String.format("%.8f",z));		
	}
}
