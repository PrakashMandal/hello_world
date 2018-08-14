package example.data_structure.Arrays;
import java.util.*;

public class binSearch{
	static int[] array;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size ");
		int n=sc.nextInt();
		System.out.print("Enter array \n");
		array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();

		System.out.print("Enter number to be searched ");
		int search=sc.nextInt();
		
		//sorting the array
		Arrays.sort(array);

		int position=binarySearch(0,n-1,search);
		if(position == -1)
			System.out.println("not found");
		else
			System.out.println("found at "+position);
	
	}
	static int binarySearch(int l, int h, int x)
    {
    	if(l<h){
    		int mid=(l+h)/2;
    		if(x == array[mid])
    			return mid;
    		else if(x < array[mid])
    			binarySearch(l,mid-1,x);
    		else
    			binarySearch(mid+1,h,x);
    	}
        return -1;
    }
}