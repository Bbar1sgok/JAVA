import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int side1, side2;
        double hypotenuse;

        System.out.println("Please enter the length of the first side:");
        side1 = input.nextInt();

        System.out.println("Please enter the length of the second side:");
        side2 = input.nextInt();

        // Pythagorean theorem: √(a² + b²)
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        // Print the result with 2 decimal places
        System.out.printf("The length of the hypotenuse is: %.2f\n", hypotenuse);
    }
}
