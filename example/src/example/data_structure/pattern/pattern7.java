package example.data_structure.pattern;

import java.util.*;

public class pattern7{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size ");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++)
				if(i%2 == 0) System.out.print("*");
				else System.out.print("#");
			System.out.println();
		}
	}
}