package example.data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
    	int q = sc.nextInt();
    	while(q!=0){
    	    int n = sc.nextInt();
    	    ArrayList<Integer> arr = new ArrayList<Integer>(n);
    		for(int i=0;i<n;i++)
    			arr.add(sc.nextInt());
    		int t=0;
    		if(n>1){
        		do {
	    		    try{
	        			arr.add(0,arr.remove(arr.size()-1));
	        			if((arr.size()-1-t)>0)
	        				arr.remove(arr.size()-1-t);
	        			else
	        				arr.remove(0);
	    		    }catch(Exception e){break;}
	    			t++;
        		}while(arr.size()!=1);
    		}
    		if(n>0)System.out.println(arr.get(0));
    		q--;
    	}
    	sc.close();
	}
}
