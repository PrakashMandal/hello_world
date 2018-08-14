package example.data_structure;
import java.io.*;
import java.util.*;

public class RotateList{

    // Complete the utopianTree function below.

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        ArrayList<ArrayList<Integer>> Arr = new ArrayList<ArrayList<Integer>>(n);
        for(int j=0;j<n;j++) {
        	ArrayList<Integer> A =new ArrayList<Integer>(m);
            for(int i=0;i<m;i++){
	            int array=scanner.nextInt();
	            A.add(array);
        	}
        	Arr.add(A);
        	//A.clear();
        }
        System.out.println(Arr);
        scanner.close();
    }
    
    static ArrayList<Integer> rotate(ArrayList<Integer> A){
    	ArrayList<Integer> N = new ArrayList<Integer>(2*A.size());
    	for(int i=0;i<2*A.size();i++)
    		N.add(0);
			
		for(int i=0;i<A.size();i++) {
			N.set(i, A.get(i));
			N.set(i + A.size(), A.get((A.size() - i) % A.size()));
		}
		return N;
    }
}
