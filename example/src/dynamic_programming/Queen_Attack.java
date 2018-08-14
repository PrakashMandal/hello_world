 package dynamic_programming;

 import java.util.*;

 public class Queen_Attack {
	private static int[][] obstacles;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt(),o=sc.nextInt();
		 int i=sc.nextInt(),j=sc.nextInt();
		 obstacles = new int[o][2];
		 for(int k=0;k<o;k++) {
			 obstacles[k][0]=sc.nextInt();
			 obstacles[k][0]=sc.nextInt();
		 }
		 sc.close();
		 long start = System.currentTimeMillis();
		 System.out.println(queen(i,j,n));
		 float end = (float)(System.currentTimeMillis() - start)/1000;
		 System.out.println(end);
		 
	 }
	 private static boolean inRow_Col(int a,int b) {
		 for(int k=obstacles.length-1;k>=0;) {
			 if(obstacles[k][1] == b) {
				 if(obstacles[k][0] == a)
					 return true;
				 else k++;
			 }
			 else k++;
		 }
		 return false;
	 }
	 private static int queen(int a, int b,int n) {
		// TODO Auto-generated method stub
		int result=0;
		int diff=a-b,sum=a+b;
		//System.out.println("upr right diagonal");
		for(int i=a-1,j=b-1;i>0 && j>0;i--,j--) {		
			if(inRow_Col(i,j)) {break;}
			else  {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\nbottom to top");
		for(int i=a-1;i>0;i--) {int j=b;
			if(inRow_Col(i,j)) {break;}
			else  {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\nleft to right ");
		for(int j=b-1;j>0;j--) {int i=a;
			if(inRow_Col(i,j))break;
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}	
		//System.out.println("\nupr left diagonal");
		for(int i=a-1,j=b+1;i>0 && j<=n;i--,j++) {
			if(inRow_Col(i,j)) {break;}
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\ntop to bottom");
		for(int i=a+1;i<=n;i++) {int j=b;
			if(inRow_Col(i,j)) {break;}
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\nleft to right");
		for(int j=b+1;j<=n;j++) {int i=a;
			if(inRow_Col(i,j))break;
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\n lwr right diagonal");		
		for(int i=a+1,j=b+1;i<=n && j<=n;i++,j++) {
			if(inRow_Col(i,j)) {break;}
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\nlwr left diagnal");
		for(int i=a+1,j=b-1;i<=n && j>0;i++,j--) {
			if(inRow_Col(i,j)) {break;}
			else {
			//	System.out.print(i+""+j+" ");
				result++;}
		}
		//System.out.println("\n result");
		return result;
	}
}