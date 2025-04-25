import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        int check;
        boolean isPrime;
        System.out.println("1 is not a prime number.");
        
        do {
            isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                check = i % j;

                if (check == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (!isPrime) {
                System.out.printf("%d is not a prime number.\n", i);
            } else {
                System.out.printf("%d is a prime number.\n", i);
            }

            i++;
        } while (i < 1000);
    }
}
