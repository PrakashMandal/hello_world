package example.data_structure.pattern;

import java.util.*;

public class pattern6{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter length and breadth ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int i,j;
		if(b==1 || l==1)
			System.out.println("Not possible");
		else{
			for(i=1;i<=l;i++){
				for(j=1;j<=b;j++)
					if(i==1 || j==1 || i==l || j==b)
						System.out.print("a ");
					else
						System.out.print("  ");
				System.out.println();
			}
		}

	}
}