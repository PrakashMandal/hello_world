package dynamic_programming;

import java.util.Scanner;

public class fibonacci_bottom_up {

	static long[] fibb;
	public static long fibo(int n) {
		// TODO Auto-generated constructor stub
		fibb = new long[n+1];
		fibb[0]=1;
		fibb[1]=1;
		if(n<2)
			return 1;
		for(int i=2;i<=n;i++) {
			fibb[i]=fibb[i-2]+fibb[i-1];
		}
		return fibb[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Fibbonacci of "+n+" terms ");
		System.out.println(fibo(n));
		/*for(int x : fibb)
			System.out.print(x+",");*/
		sc.close();
	}

}
