import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String regex = "\\d+";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);
        
        String input = "The year 2025 has started";

        // Match the regular expression pattern against the input string
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found a number: " + matcher.group());
        }
        
        // Replace all found numbers with "2024"
        input = matcher.replaceAll("2024");
        
        matcher = pattern.matcher(input);  // Re-create matcher with the new input string
        
        while (matcher.find()) {
            System.out.println("Found a number: " + matcher.group());
        }
    }
}

