package example.data_structure.Arrays;

import java.util.Scanner;

public class rotateArray {
	private static int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int c = sc.nextInt();
		int[] a = rotate(c);
		for(int x : a)
			System.out.print(x+" ");
		
		sc.close();
	}
	
	private static int[] rotate(int c) {
		// TODO Auto-generated method stub
		int len=arr.length,len1 = c%len,n=0;
		//System.out.println(len1+" "+len);
		if(len1 == 0)
			return arr;
		else {
			int[] arr1 = new int[len];
			for(int i=len1;i<len;i++)
				arr1[n++]=arr[i];
			for(int i=0;i<len1;i++)
				arr1[n++]=arr[i];		
			return arr1;
		}
	}

}
