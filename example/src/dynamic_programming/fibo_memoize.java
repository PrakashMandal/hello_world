package dynamic_programming;

import java.util.Scanner;

public class fibo_memoize {
	static int[] mem;
	public static int fibo(int n) {
		
		// TODO Auto-generated constructor stub
		if(mem[n] != 0)
			return mem[n];
		if(n<2) {
			mem[n] = 1;
		}
		else {
			mem[n] = fibo(n-2)+fibo(n-1);
		}
		return mem[n];
	}
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		mem = new int[n+1];
		System.out.println("Fibbonacci of "+n+" terms ");
		System.out.println(fibo(n));
		for(int x : mem)
			System.out.print(x+",");
		sc.close();
	}
}
