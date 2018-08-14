package example.demoException;

import java.util.Scanner;

class hackerrank{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {
	public int power(int arg0, int arg1) throws Exception {
		if(arg0 <0 || arg1<0) 
				throw new Exception("n and p should be non-negative");
		return (int) Math.pow(arg0,arg1);
	}
}

class myException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public myException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		System.out.println(arg0.toLowerCase());
	}
}