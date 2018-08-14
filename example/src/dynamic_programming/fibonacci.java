package dynamic_programming;

import java.util.Scanner;

public class fibonacci {

	public static int  fibo(int n) {
		// TODO Auto-generated constructor stub
		if(n<2) {
			//System.out.print(1);
			return 1;
		}
		else {
			//System.out.print(fibo(n-2)+fibo(n-1));
			return fibo(n-2)+fibo(n-1);
		}
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("Fibbonacci of "+n+" terms ");
		System.out.print(fibo(n));
		sc.close();
	}

}
