package example.data_structure.pattern;

import java.util.*;

public class pattern4{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size ");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++){
			for(int k=n;k>i;k--)
				System.out.print("a ");
			for(j=0;j<i;j++)
				System.out.print("  ");
			for(j=0;j<i;j++)
				System.out.print("  ");
			for(int k=n;k>i;k--)
				System.out.print("a ");
			System.out.println();
		}
	}
}