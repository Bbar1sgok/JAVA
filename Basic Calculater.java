import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        float result, inputNumber1, inputNumber2;
        int operation;

        System.out.println("Please enter the first number: ");
        inputNumber1 = scanner.nextFloat();

        System.out.println("Please enter the second number: ");
        inputNumber2 = scanner.nextFloat();

        System.out.println("Please select the operation you want to perform: ");
        System.out.println("1-> ADDITION \t 2-> SUBTRACTION \t 3-> MULTIPLICATION \t 4-> DIVISION ");
        operation = scanner.nextInt();

        switch (operation) {

            // ADDITION
            case 1:
                System.out.println("The sum of the entered numbers: " + (inputNumber1 + inputNumber2));
                break;

            // SUBTRACTION
            case 2:
                System.out.println("The difference of the entered numbers: " + (inputNumber1 - inputNumber2));
                break;

            // MULTIPLICATION
            case 3:
                System.out.println("The product of the entered numbers: " + (inputNumber1 * inputNumber2));
                break;

            // DIVISION
            case 4:
                if (inputNumber2 != 0) {
                    System.out.println("The division of the entered numbers: " + (inputNumber1 / inputNumber2));
                } else if (inputNumber1 == 0 && inputNumber2 == 0) {
                    System.out.println("The division of zero by zero is indeterminate.");
                } else {
                    System.out.println("The division of a non-zero number by zero is undefined.");
                }
                break;

            default:
                System.out.println("No valid operation selected...");
        }

        scanner.close();
    
    
    
    
    
    
    }


}
