import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        String wordToFind = "anudip";
        String regex = "\\b" + wordToFind + "\\b";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        String input = "The headquarter of anudip foundation is in Kolkata";

        // Match the regular expression pattern against the input string
        Matcher matcher = pattern.matcher(input);

        boolean wordFound = matcher.find();
        if (wordFound) {
            System.out.println("The word '" + wordToFind + "' is present in the string '" + input + "'.");
        } else {
            System.out.println("The word '" + wordToFind + "' is not present in the string '" + input + "'.");
        }
    }
}