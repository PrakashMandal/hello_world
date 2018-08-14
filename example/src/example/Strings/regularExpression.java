package example.Strings;

import java.util.*;

public class regularExpression {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	String delim = " ";
    	String input = scanner.nextLine();
    	String[] arr = input.split(" ");
    	String result="";
    	for(String x : arr) {
    		result+=x;
    		System.out.println(x);
    	}

		System.out.println(result);
    }
}
