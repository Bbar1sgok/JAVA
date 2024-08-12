import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables
        int girilenSayi, i, j;

        System.out.print("Please enter the number of rows you want to print: ");
        girilenSayi = scanner.nextInt();

        // Check if the entered number is positive
        if (girilenSayi > 0) {
            for (i = 0; i <= girilenSayi; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Move to the next line after printing each row
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Close the scanner
        scanner.close();
    }
}
