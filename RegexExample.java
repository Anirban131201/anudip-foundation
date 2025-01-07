import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        // Define a regular expression pattern
        String regex = "Sumanth Reddy";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the regular expression pattern against the input string
        Matcher matcher = pattern.matcher("Tanuja");

        // Use the matcher instance to call the find() method
        boolean matchfound = matcher.find();
        
        // Check if the pattern matches the input string
        System.out.println("Match found: " + matchfound);
    }
}