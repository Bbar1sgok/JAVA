import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account("123456", 5000.0, "Ali Veli", "ali@gmail.com", "05555555555");
        User user = new User("ali123", "123456");

        System.out.println("--- Kullanıcı Giriş Ekranı ---");

        int denemeHakki = 3;
        boolean girisBasarili = false;

        while (denemeHakki > 0) {
            System.out.print("Kullanıcı Adı: ");
            String kullaniciAdi = input.nextLine();
            System.out.print("Şifre: ");
            String sifre = input.nextLine();

            if (kullaniciAdi.equals(user.getKullaniciIsmi()) && sifre.equals(user.getSifre())) {
                System.out.println("✅ Başarıyla giriş yapıldı.\n");
                girisBasarili = true;
                break;
            } else {
                denemeHakki--;
                System.out.println("Hatalı giriş. Kalan deneme hakkı: " + denemeHakki);
            }
        }

        if (girisBasarili) {
            int secim;

            do {
                System.out.println("\n=== Banka Uygulaması ===");
                System.out.println("1. Bakiye Görüntüle");
                System.out.println("2. Para Yatır");
                System.out.println("3. Para Çek");
                System.out.println("4. Hesap Bilgilerini Görüntüle");
                System.out.println("5. Çıkış");
                System.out.print("Seçiminiz: ");

                while (!input.hasNextInt()) {
                    System.out.print("Lütfen geçerli bir sayı girin: ");
                    input.next();
                }

                secim = input.nextInt();

                switch (secim) {
                    case 1:
                        System.out.printf("Mevcut Bakiye: %.2f TL\n", account.getBakiye());
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz miktar: ");
                        double yatir = input.nextDouble();
                        account.paraYatir(yatir);
                        break;
                    case 3:
                        System.out.print("Çekmek istediğiniz miktar: ");
                        double cek = input.nextDouble();
                        account.paraCek(cek);
                        break;
                    case 4:
                        System.out.println("\n--- Hesap Bilgileri ---");
                        System.out.println("İsim: " + account.getIsim());
                        System.out.println("Hesap No: " + account.getHesapNo());
                        System.out.println("Email: " + account.getEmail());
                        System.out.println("Telefon No: " + account.getTelefonNo());
                        System.out.printf("Bakiye: %.2f TL\n", account.getBakiye());
                        break;
                    case 5:
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim, tekrar deneyin.");
                }
            } while (secim != 5);
        } else {
            System.out.println(" 3 kez hatalı giriş yaptınız. Program sonlandırılıyor.");
        }

        input.close();
    }
}
