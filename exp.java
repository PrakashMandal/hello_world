import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class exp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(),n=3,i;
        try{
            while(T!=0 && T<=50){
                n=sc.nextInt();
                int[] x=new int[n];
                int[] y=new int[n];
                for(i=0;i<n;i++){
                    x[i]=sc.nextInt();
                    y[i]=sc.nextInt();
                }
                int shrp_trn=0;
                for(i=1;i<n;i=i+2){
                    
                    //System.out.print("Angle between ("+x[i-1]+","+y[i-1]+")("+x[i]+","+y[i]+") and ("+x[i]+","+y[i]+")("+x[i+1]+","+y[i+1]+") : ");
                    
                    double m1=0,m2=0;
                    if((x[i]-x[i-1]) == 0)
                        m1=0;
                    else
                        m1=(y[i]-y[i-1])/(x[i]-x[i-1]);

                    if((x[i+1]-x[i]) == 0)
                        m2=0;
                    else
                        m2=(y[i+1]-y[i])/(x[i+1]-x[i]);

                    double angle=Math.toDegrees(Math.atan(m1)) - Math.toDegrees(Math.atan(m2));
                    System.out.println(m1+","+m2+","+angle);
                    if(angle>45)
                        shrp_trn++;
                    
                }
                //System.out.println(shrp_trn);

                if(shrp_trn==1)
                    System.out.println("no yes");
                else if(shrp_trn==0)
                    System.out.println("yes yes");
                else
                    System.out.println("no no");
                T--;    
            }
        }
        catch(ArrayIndexOutOfBoundsException aie){
            if(n<3 && n>50){System.out.println("Number of co-ordinates is illegeal.");};
        }
        catch(ArithmeticException ae){
            System.out.println("math error");
        }
    }        
}
