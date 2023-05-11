package Basic.Collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regex is used to define regular expression and replace with desired data
// The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings
// Regular expressions can be used to perform all types of text search and text replace operations.
// Pattern Class - Defines a pattern (to be used in a search)
// Matcher Class - Used to search for the pattern
// PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

public class Regex {
    public static void main(String[] args) {
        String s = " My name is Regex, i am here to help you with my operations";

        // WE need to define object of Patter and Matcher class and use them

        Pattern p = Pattern.compile("REGEX",Pattern.CASE_INSENSITIVE); // this we need to check in p pattern 
        Matcher m = p.matcher(s); //   we load Pattern with our text 

        boolean matched = m.find();
        // similar to find() method there are many method like replace also 
        System.out.println(matched);

        // replace 

        // String replaced = m.replaceAll(" ");

        System.out.println(reverseString(s));
    }

    
    public static String reverseString(String str) 

    {
        StringBuilder sb=new StringBuilder();
        String[] s=str.split("\\s+");
        for(int i=s.length-1;i>=0;i--)

        {
            sb.append(s[i]+" ");
        }
        return sb.toString().trim();
    }

}
