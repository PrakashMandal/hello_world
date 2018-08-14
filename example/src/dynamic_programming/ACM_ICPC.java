package dynamic_programming;

import java.io.*;
import java.util.*;

public class ACM_ICPC {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextLong();
		int sum=0,mod=0;
		for(int i=1;i<=n;i++) {
			long[] temp = new long[i];
			for(int j=0;j<i;j++)
				temp[j] = arr[j];
		}
	}
	static long maximumSum(long[] a, long m) {
		return 0;
    }
}
