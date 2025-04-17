import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double basePrice, vatAmount, totalPrice;
        float vatRate;

        System.out.print("Enter the base price: ");
        basePrice = input.nextDouble();

        System.out.print("Enter the VAT rate (%): ");
        vatRate = input.nextFloat();

        vatAmount = basePrice * vatRate / 100;
        totalPrice = basePrice + vatAmount;

        System.out.println("\n--- Calculation Results ---");
        System.out.println("Base Price: " + basePrice);
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Total Price (Including VAT): " + totalPrice);
    }
}
