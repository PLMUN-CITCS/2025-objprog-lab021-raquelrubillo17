import java.util.Scanner;

public class WordCounter {
    
    // Method to get a sentence from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }
    
    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the input is null or empty
        }
        String[] words = sentence.trim().split("\\s+"); // Splitting by spaces
        return words.length;
    }
    
    public static void main(String[] args) {
        // Get sentence input from the user
        String sentence = getSentenceInput();
        
        // Count the number of words
        int wordCount = countWords(sentence);
        
        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}

