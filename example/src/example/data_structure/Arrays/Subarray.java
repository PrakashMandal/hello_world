package example.data_structure.Arrays;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=j;k<i+j && k<=n;k++)
					System.out.print(k+" ");
				System.out.println();
			}
		}
	}

}
