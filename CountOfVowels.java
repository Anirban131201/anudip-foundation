public class CountOfVowels {
	
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert character to lowercase for case-insensitive comparison
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; // Check if the character is a vowel
    }

    public static void main(String[] args) {
        // Input word for which vowels need to be counted
        String word = "Anirban";

        // Counter to keep track of the number of vowels
        int vowelCount = 0;

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); // Get the character at the current index

            // Check if the character is a vowel
            if (isVowel(ch)) {
                vowelCount++; // Increment the vowel count
            }
        }

        // Print the total number of vowels in the word
        System.out.println("The number of vowels in '" + word + "' is " + vowelCount);
    }
}
