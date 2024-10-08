import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the word you want to check: ");
        String inputWord = scanner.nextLine();
        
        // Close the scanner to free up resources
        scanner.close();

        // Reverse the word with StringBuilder
        StringBuilder sb = new StringBuilder(inputWord);
        String reverseWord = sb.reverse().toString();

        // equalsIgnoreCase checks if the original word and reversed word are the same, ignoring case
        if(inputWord.equalsIgnoreCase(reverseWord)){
            System.out.println("Congratulations, this is a palindromic word!");
        } else {
            System.out.println("Unfortunately, this is not a palindromic word.");
        }
    }
}
