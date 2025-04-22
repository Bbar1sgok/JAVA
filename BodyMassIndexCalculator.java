import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Body Mass Index (BMI) Calculator!");

        System.out.print("Please enter your weight in kilograms (e.g., 85): ");
        double weight = input.nextDouble();

        System.out.print("Please enter your height in meters (e.g., 1.90): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your Body Mass Index is: %.2f\n", bmi);

        // BMI category display
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

    }
}
