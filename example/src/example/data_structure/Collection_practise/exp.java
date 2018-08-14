package example.data_structure.Collection_practise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exp {

    public static void main(String[] args) {

        String regex = "(\\b\\w+\\b)(\\b\\s+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            System.out.print(m.toString()+" ");
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(0).split(" ")[0] );
            }
            
            // Prints the modified sentence.
            System.out.print("\n"+input);
        }
        
        in.close();
    }
}