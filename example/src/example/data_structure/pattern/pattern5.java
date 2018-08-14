package example.data_structure.pattern;

import java.util.*;

public class pattern5{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter length and breadth ");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int i,j;
		for(i=0;i<l;i++){
			for(j=0;j<b;j++)
				System.out.print("a ");
			System.out.println();
		}
	}
}