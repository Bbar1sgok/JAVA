import java.util.Scanner;

public class ArmstrongSayi {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Variables
        int inputNumber, tempNumber, result = 0, digitValue;
        int numberOfDigits = 0;

        // Prompt the user to enter a positive number
        do {
            
            System.out.println("Please enter a positive number to check: ");
            inputNumber = scanner.nextInt();
            
        } while (inputNumber <= 0);

        // Assign inputNumber to a temporary variable and calculate the number of digits
        tempNumber = inputNumber;
        
        while (tempNumber != 0) {
            
            tempNumber /= 10;
            numberOfDigits++;
       
        }

        // Reassign tempNumber to inputNumber
        tempNumber = inputNumber;

        // Calculate the sum of the powers of the digits
        while (tempNumber > 0) {
           
            digitValue = tempNumber % 10;  // Find the last digit
            tempNumber /= 10;  // Remove the last digit

            // Add the power of the digit to the result
            result += Math.pow(digitValue, numberOfDigits);
        
        }

        // Check if the input number is an Armstrong number
        if (inputNumber == result) {
            
            System.out.println("The entered number is an Armstrong number.");
        
        } 
        else {
           
            System.out.println("The entered number is not an Armstrong number.");
        
        }

        scanner.close();  // Close the Scanner object

    }
}
