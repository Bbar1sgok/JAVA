import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman programına hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n" +
                "Burpee\n" +
                "Pushup(Şınav)\n" +
                "Situp(Mekik)\n" +
                "Squat";

        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee sayısı giriniz:");
        int burpee = scanner.nextInt();
        System.out.println("Pushup sayısı giriniz:");
        int pushup = scanner.nextInt();
        System.out.println("Situp sayısı giriniz:");
        int situp = scanner.nextInt();
        System.out.println("Squat sayısı giriniz:");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("Idmanınız başlıyor...");

        while(idman.idmanBittiMi() == false){

            System.out.println("Hareket Türü (Burpee, Pushup, Situp, Squat):");
            String tur = scanner.nextLine();

            System.out.println("Bu hareketten kaç tane yapıcaksınız ? :");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);


        }

        System.out.println("Idmanını başarıyla bitirdin.");

    }
}