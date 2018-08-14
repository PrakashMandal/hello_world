package example.data_structure.Arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(),n = sc.nextInt();
		int[] arr = {0};
		arr = new int[m];
				
		while(n!=0) {
			int a = sc.nextInt(),b = sc.nextInt(), k= sc.nextInt();
			arr[a] += k;
			if(b < m) arr[b] -= k;
			n--;
		}
		sc.close();
		int max=0;
		for(int x : arr) {
			n += x;
			System.out.println(x+" "+n);
			if(max<n)
				max = n;
		}
		System.out.println(max);
	}

}
