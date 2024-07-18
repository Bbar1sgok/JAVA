import java.util.Scanner;

// ASAL SAYI SORGULAMA
public class AsalSorgulama {

    public static boolean asalMi(int sayi){

        for(int i = 2; i < sayi; i++){

            if(sayi % i == 0){

                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int girilenSayi;
        String sorgulama;

        while (true) {

            System.out.println("Hangi pozitif sayıya kadar asallık sorgulamak istersiniz: ");

            // Kullanıcı tamsayı girene kadar döngüde kal
            while (!scanner.hasNextInt()) {

                System.out.println("Geçersiz giriş! Pozitif bir tam sayı giriniz: ");
                scanner.next(); // Geçersiz girişi atla

            }

            girilenSayi = scanner.nextInt();



            if(girilenSayi > 2){

                for (int i = 2; i < girilenSayi; i++) {

                    if (asalMi(i)) {

                        System.out.println(i + " asaldır. ");

                    }

                }

            }
            else {

                System.out.println(" 1 asal sayı değildir. ");

            }

            // Döngüden çıkış
            System.out.println("Çıkış yapmak için (h/H) devam etmek içim herhangi bir şeye basınız.");

            scanner.nextLine();  // Boş satırı atlamak için
            sorgulama = scanner.nextLine();

            if(sorgulama.equalsIgnoreCase("h")){

                System.out.println("Başarılı çıkış");
                break;
            }


        }
        scanner.close();
    }
}
