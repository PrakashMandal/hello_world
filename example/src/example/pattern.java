package example; 

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				//if(i==0 || j==0 || i==n-1 ||j==m-1)
					print(c);
				//else
					//print(0);
				c++;
			}
			System.out.println();
		}
		sc.close();
	}
	static void print(int c) {
		if(c==0)
			System.out.print("    ");//4 space
		else if(c<10)
			System.out.print(c+"   ");//3 space
		else if(c<100)
			System.out.print(c+"  ");//2 space
		else
			System.out.print(c+" ");//1 space
	}
}
