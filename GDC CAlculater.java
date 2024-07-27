import java.util.Scanner;

public class GCDCalculator {

    // Method to calculate the greatest common divisor (GCD) using the Euclidean algorithm
    public static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2; // Assign b to a temporary variable
            number2 = number1 % number2; // Update b to be a mod b
            number1 = temp; // Assign a to the temporary variable (old value of b)
        }
        return number1; // When b is zero, a is the GCD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.println("Please enter the first number to calculate the GCD: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer: ");
            scanner.next(); // Skip invalid input
        }
        int number1 = scanner.nextInt();

        // Prompt user for the second number
        System.out.println("Please enter the second number to calculate the GCD: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer: ");
            scanner.next(); // Skip invalid input
        }
        int number2 = scanner.nextInt();

        // Calculate and display the GCD
        System.out.println("The GCD of the two numbers is: " + gcd(number1, number2));
    }


}
