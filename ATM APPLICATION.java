import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
           // ATM APPLICATION

        Scanner scanner = new Scanner(System.in);
        // VERIABLES
        float bakiye = 30000, paraCekme, paraYatirma, kalanBakiye;
        int islem, girisHakki = 3;
        String user, password;

        while (girisHakki > 0) {
            System.out.println("Lütfen kullanıcı adınızı giriniz: ");
            user = scanner.nextLine();

            System.out.println("Lütfen şifrenizi giriniz: ");
            password = scanner.nextLine();

            if (user.equals("userLogin") && password.equals("1234")) {
                while (true) {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-> Bakiye sorgulama \t 2-> Para Çekme \t 3-> Para Yatırma \t 4-> Çıkış Yapma");

                    islem = scanner.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.println("Hesabınızda bulunan para miktarı: " + bakiye);
                            break;

                        case 2:
                            System.out.println("Lütfen hesabınızdan çekmek istediğiniz para miktarını giriniz: ");
                            paraCekme = scanner.nextFloat();

                            if (paraCekme < 0) {

                                System.out.println("Geçersiz para miktarı. Lütfen pozitif bir miktar giriniz.");
                            }
                            else {
                                kalanBakiye = bakiye - paraCekme;
                                if (kalanBakiye >= 0) {

                                    System.out.println("Hesabınızdan para çekme işlemi gerçekleştirilmiştir. Hesabınızda kalan para: " + kalanBakiye);
                                    bakiye = kalanBakiye;

                                }
                                else {

                                    System.out.println("Hesabınızda yeterli para miktarı yoktur. Hesabınızdaki para miktarı: " + bakiye);
                                }
                            }
                            break;

                        case 3:

                            System.out.println("Lütfen hesabınıza yatırmak istediğiniz para miktarını giriniz: ");
                            paraYatirma = scanner.nextFloat();

                            if (paraYatirma < 0) {

                                System.out.println("Geçersiz para miktarı. Lütfen pozitif bir miktar giriniz.");
                            }
                            else {

                                bakiye = paraYatirma + bakiye;
                                System.out.println("Hesabınıza para başarıyla yatırılmıştır. Hesabınızdaki son para miktarı: " + bakiye);

                            }
                            break;

                        case 4:
                            System.out.println("Başarılı şekilde çıkış yapıldı.");
                            girisHakki = 0;
                            break;

                        default:
                            System.out.println("Geçersiz işlem seçimi. Lütfen 1 ile 4 arasında bir değer giriniz.");
                            break;
                    }

                    if (islem == 4) {
                        break;
                    }
                }
            } else {
                --girisHakki;
                System.out.println("Hatalı Giriş Yaptınız: " + girisHakki + " deneme hakkınız kaldı.");
                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloka edildi lütfen müşteri hizmetlerine başvurunuz.");
                }
            }
        }
        scanner.close();

      
      
    }
}
