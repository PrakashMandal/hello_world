package example.data_structure.sorting;

import java.util.Random;
import java.util.Scanner;

public class exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(partition_random(arr,0,n-1));
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	static int partition_random(int[] arr, int low, int high) {
		Random random = new Random();
        int n = random.nextInt((high - low) + 1) + low;
        System.out.println(n);
        int temp = arr[n];
        arr[n] = arr[0];
        arr[0] = temp;
        return partition(arr,low,high);
	}
	static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[low];
		int i = low;
		for(int j=low+1;j<=high;j++) {
			if(arr[j]<=pivot) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		/*int temp = arr[i];
		arr[i] = arr[low];
		arr[low] = temp;*/
		return i;
	}
}
