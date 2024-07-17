import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vizeNotu1, vizeNotu2, finalNotu;
        double toplamNot;

        // We are taking notes from the user.
        System.out.println("Lütfen birinci vize notunuzu giriniz: ");
        vizeNotu1 = scanner.nextInt();

        System.out.println("Lütfen ikinci vize notunuzu giriniz: ");
        vizeNotu2 = scanner.nextInt();

        System.out.println("Lütfen final notunuzu giriniz: ");
        finalNotu = scanner.nextInt();

        // Calculate grade
        toplamNot = (vizeNotu1 * 0.3) + vizeNotu2 * 0.3 + finalNotu * 0.4;

        // Querying for letter grades.
        if (toplamNot >= 90){

            System.out.println("Harf notunuz: AA");
            
        }
        else if (toplamNot >= 80) {

            System.out.println("Harf notunuz: BB");

        }
        else if (toplamNot >= 70) {

            System.out.println("Harf notunuz: CC");

        }
        else if (toplamNot >= 60) {

            System.out.println("Harf notunuz: DD");

        }
        else{

            System.out.println("Harf notunuz: FF");
            System.out.println("Dersten kaldınız");

        }

        scanner.close();
      


    }
}
