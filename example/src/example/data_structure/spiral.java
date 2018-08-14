package example.data_structure;

import java.util.Scanner;

public class spiral {
	
	public static int[] Spiral(int[][] A) {
		// TODO Auto-generated constructor stub
		int i, k = 0,m=A.length, l = 0,n=A[0].length;
		int[] R = new int[m*n];
		int c=0;
			System.out.println(m+" "+n);
          
        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
                R[c++]=A[k][i];
            }
            k++;
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i)
            {
            	R[c++]=A[i][n-1];
            }
            n--;
  
            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                	R[c++]=A[m-1][i];
                }
                m--;
            }
  
            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                	R[c++]=A[i][l];
                }
                l++;    
            }        
        }
		return R;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] A = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		for(int[] x : A) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		int[] R = Spiral(A);
		for(int x : R)
			System.out.print(x+" ");
		
		sc.close();
	}

}
