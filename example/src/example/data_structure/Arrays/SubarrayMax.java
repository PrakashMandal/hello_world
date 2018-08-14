package example.data_structure.Arrays;

import java.util.Scanner;

public class SubarrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		int[] temp = new int[k];
		sc.close();
		int i=0;
		while(i<n){
			int k1 = 0;			
			for(int j=i;j<i+k && j<n;j++)
				temp[k1++] = arr[j];
			for(int j=k1-1;j>=0;j--)
				System.out.print(temp[j]+" ");
				i += k;
		}
	}

}
