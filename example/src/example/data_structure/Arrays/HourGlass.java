package example.data_structure.Arrays;

import java.io.*;
import java.util.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	
    	int max=-1000000000,sum;
    	
    	for(int i=1;i<arr.length;i++) {		
			for(int j=1;j<arr[i].length;j++) {
				sum = arr[i][j];
				try {
					//System.out.println(arr[i-1][j-1]+" "+arr[i-1][j]+" "+arr[i-1][j+1]);
					sum +=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1];
					//System.out.println("  "+arr[i][j]);
					//sum +=arr[i][j];
					//System.out.println(arr[i+1][j-1]+" "+arr[i+1][j]+" "+arr[i+1][j+1]);
					sum +=arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
					//System.out.println(sum);
				}
	    		catch(Exception aiobe) {
	    			sum = max;
	    		}
				if(max<sum)
					max=sum;
			}
    	}
    	return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = sc.nextInt();
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        scanner.close();
    }
}
