import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("******** Beyblade Programına Hoşgeldiniz ********");
        System.out.println("Çıkış için q'ya basınız.");

        Scanner input = new Scanner(System.in);
        BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

        while (true) {
            System.out.print("Hangi Beyblade'i üretmek istersiniz: ");
            String islem = input.nextLine().toLowerCase(Locale.ROOT);

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            Beyblade beyblade = fabrika.beybladeUret(islem);

            if (beyblade == null) {
                System.out.println("Lütfen geçerli bir Beyblade ismi giriniz.\n");
            } else {
                beyblade.bilgileriGoster();
                beyblade.saldiriYap();
                beyblade.kutsalCanavarOrtayaCikar();
            }
        }
    }
}