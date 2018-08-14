package example.data_structure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		ArrayList<String> strings = new ArrayList<String>();
		for(int i=0;i<s;i++) {
			String str = sc.next();
			strings.add(str);
		}
		int q = sc.nextInt();
		ArrayList<String> queries = new ArrayList<String>();
		for(int i=0;i<q;i++) {
			String str = sc.next();
			queries.add(str);
		}
		
		for(int i=0 ; i<queries.size();i++) {
			int c=0;
			for(int j=0;j<strings.size();j++) {
				if(strings.get(j).equals(queries.get(i))) {
					c++;strings.remove(j);
				}
			}
			System.out.println(c);
		}
	}
}
