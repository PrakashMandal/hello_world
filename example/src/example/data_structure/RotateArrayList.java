package example.data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q!=0) {
			int n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>(n);
			for(int i=0;i<n;i++)
				arr.add(sc.nextInt());
			int d = sc.nextInt();
			while(d!=-1) {
				arr.add(0,arr.remove(arr.size()-1));
				d--;
			}
			for(int x : arr)
				System.out.print(x+" ");
			q--;
		}
	}

}
