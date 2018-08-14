package example.data_structure.sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int j=0;j<n;j++)
			arr[j] = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x : arr)
			System.out.print(x+" ");
	}
}
