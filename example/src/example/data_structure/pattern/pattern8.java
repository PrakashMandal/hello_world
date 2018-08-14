package example.data_structure.pattern;

import java.util.*;

public class pattern8{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter size ");
		int n=sc.nextInt();
		int i,j,c=0;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print((char)(97+c));c++;
			}
			System.out.println();
		}
	}
}