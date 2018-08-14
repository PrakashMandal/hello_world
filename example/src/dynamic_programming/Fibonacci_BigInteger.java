package dynamic_programming;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_BigInteger {
	public ArrayList<Integer> arr = new ArrayList<Integer>();
	int size;
	public Fibonacci_BigInteger(int n) {
		// TODO Auto-generated constructor stub
		arr.add(1);
		size=1;
		for(int i=2;i<=n;i++)
			multiply(i);

		/*for(int i=arr.size()-1;i>=0;i--)
			System.out.printf("%d", arr.get(i));*/
	}
	 public String result() {
		 String s="";

		for(int i=arr.size()-1;i>=0;i--)
			s += arr.get(i);
		
		return s;		 
	 }

	private void multiply(int x) {
		// TODO Auto-generated method stub
		int carry=0;
		for(int i=0;i<arr.size();i++) {
			int product = arr.get(i)*x+carry;
			arr.set(i, product%10);
			carry = product/10;
		}
		while(carry!=0) {
			arr.add(size,carry%10);
			carry /= 10;
			size++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci_BigInteger f1 = new Fibonacci_BigInteger(n);
		System.out.println(f1.result());
	}

}
