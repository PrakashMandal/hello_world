package example.data_structure.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		MergeSort m = new MergeSort();
		m.mergeSort(arr, 0, n);
		for(int x :arr)
			System.out.print(x+" ");
	}
	void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	private void merge(int[] arr, int low,int mid, int high) {
		// TODO Auto-generated method stub
		int[] a1 = new int[mid-low+1];
		for(int i=0;i<a1.length;i++)
			a1[i] = arr[low+i];
		
		int[] a2 = new int[high-mid-1];
		for(int i=0;i<a2.length;i++)
			a2[i] = arr[i+mid+1];
		
		int c1=0,c2=0,i=low;
		
		while(c1<a1.length && c2<a2.length) {
			if(a1[c1]<=a2[c2]) {
				arr[i++]=a1[c1];c1++;}
			else {
				arr[i++]=a2[c2];c2++;}			
		}
		
		while(c1<a1.length){
			arr[i++]=a1[c1];c1++;}

		while(c2<a2.length){
			arr[i++]=a2[c2];c2++;}
		
	}
}
