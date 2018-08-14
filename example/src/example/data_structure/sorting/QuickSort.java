package example.data_structure.sorting;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		QuickSort q =new QuickSort();
		System.out.println("1.first as pivot\n2.last as pivot\n3. random pivot");
		int s = sc.nextInt();
		sc.close();
		switch(s) {
		case 1: q.quicksort_low(arr,0,n-1); break;
		case 2: q.quicksort_high(arr, 0, n-1); break;
		case 3: q.quicksort_radom(arr, 0, n-1); break;
		default: q.quicksort_low(arr,0,n-1); 
		}
		for(int x : arr)
			System.out.print(x+" ");
	}
	void quicksort_radom(int[] arr,int low,int high) {
		if(low<high) {
			int pivot = partition_random(arr,low,high);
			quicksort_radom(arr,low,pivot-1);
			quicksort_radom(arr,pivot+1,high);
		}
	}
	void quicksort_high(int[] arr,int low,int high) {
		if(low<high) {
			int pivot = partition_high(arr,low,high);
			System.out.println(pivot);
	        quicksort_high(arr,low,pivot-1);
			quicksort_high(arr,pivot+1,high);
		}
	}
	void quicksort_low(int[] arr,int low,int high) {
		if(low<high) {
			int pivot = partition_low(arr,low,high);
			System.out.println(pivot);
	        quicksort_low(arr,low,pivot-1);
			quicksort_low(arr,pivot+1,high);
		}
	}
	private int partition_low(int[] arr, int low, int high) {
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
		return i;
	}
	private int partition_high(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i;
	}
	int partition_random(int[] arr, int low, int high) {
		Random random = new Random();
        int n = random.nextInt((high - low) + 1) + low;
        System.out.println(n);
        int temp = arr[n];
        arr[n] = arr[0];
        arr[0] = temp;
        return partition_low(arr,low,high);
	}
}
