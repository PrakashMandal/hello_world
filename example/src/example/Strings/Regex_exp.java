package example.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_exp {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b";
        Pattern p = Pattern.compile(regex+" "+regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                String[] s = m.group(0).split(" ");
                
                input = input.replaceAll(m.group(), s[0] );
            }
            
            // Prints the modified sentence.
            System.out.println("\n"+input);
        }
        
        in.close();
    }
}