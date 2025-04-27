import java.util.Scanner;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OgrenciIslemleri ogrenci = new OgrenciIslemleri();
        OgretmenIslemleri ogretmen = new OgretmenIslemleri();
        DosyaIslemleri dosyaIslemleri = new DosyaIslemleri(); 
        boolean control = true;

        while (control) {
            islemlerMenusu(); 
            String secilenIslem = input.nextLine(); 

            try { 
                switch (secilenIslem) {
                    case "1":
                        ogrenciKaydetme(input, ogrenci, dosyaIslemleri); 
                        break;
                    case "2":
                        ogretmenKaydetme(input, ogretmen, dosyaIslemleri);
                        break;
                    case "3":
                        System.out.print("Lütfen okunacak dosyanın adını giriniz: ");
                        String okunacakDosya = input.nextLine();
                        String dosyaIcerigi = String.valueOf(dosyaIslemleri.oku(okunacakDosya));
                        System.out.println("\nDosya İçeriği:\n" + dosyaIcerigi);
                        break;
                    case "4":
                        System.out.print("Lütfen silinecek dosyanın adını giriniz: ");
                        String silinecekDosya = input.nextLine();
                        dosyaIslemleri.dosyayiSil(silinecekDosya);
                        break;
                    case "5":
                        control = false;
                        System.out.println("Programdan çıkılıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
                }
            } catch (Exception e) {
                System.err.println("Bir hata oluştu: " + e.getMessage());
                e.printStackTrace(); 
            }
        }
        input.close(); 
    }

    // Menü Metodu
    public static void islemlerMenusu() {
        System.out.println("\n****************** İşlemler *********************\n" +
                "1 -> Öğrenci Kaydetme\n" +
                "2 -> Öğretmen Kaydetme\n" +
                "3 -> Dosya Okuma\n" +
                "4 -> Dosya Silme\n" +
                "5 -> Çıkış Yapma\n" +
                "Lütfen bir işlem seçiniz\n");
    }

    // Öğretmen Kayıt Metodu 
    public static void ogretmenKaydetme(Scanner input, OgretmenIslemleri ogretmen, DosyaIslemleri dosyaIslemleri) {
        try {
            System.out.print("Lütfen öğretmenin ismini giriniz: ");
            String isim = input.nextLine();
            ogretmen.setIsim(isim);
            dosyaIslemleri.dosyayaYaz(isim + ",\n", "OgretmenKayitlari.txt"); 

            System.out.print("Lütfen öğretmenin soyismini giriniz: ");
            String soyIsim = input.nextLine();
            ogretmen.setSoyIsim(soyIsim);
            dosyaIslemleri.dosyayaYaz(soyIsim + ",\n", "OgretmenKayitlari.txt");

            System.out.print("Lütfen öğretmenin yaşını giriniz: ");
            int yas = Integer.parseInt(input.nextLine()); 
            ogretmen.setYas(yas);
            dosyaIslemleri.dosyayaYaz(yas + ",\n", "OgretmenKayitlari.txt");

            System.out.print("Lütfen öğretmenin okul ismini giriniz: ");
            String okulIsmi = input.nextLine();
            ogretmen.setOkulIsmi(okulIsmi);
            dosyaIslemleri.dosyayaYaz(okulIsmi + ",\n", "OgretmenKayitlari.txt");

            System.out.print("Lütfen öğretmenin branşını giriniz: ");
            String bransIsmi = input.nextLine();
            ogretmen.setBrans(bransIsmi);
            dosyaIslemleri.dosyayaYaz(bransIsmi + ",\n", "OgretmenKayitlari.txt");

            System.out.println("Öğretmen kaydı başarıyla gerçekleştirildi.\n");
        } catch (NumberFormatException e) {
            System.err.println("Geçersiz yaş girişi. Lütfen bir sayı girin.");
        }
    }

    // Öğrenci Kayıt Metodu
    public static void ogrenciKaydetme(Scanner input, OgrenciIslemleri ogrenci, DosyaIslemleri dosyaIslemleri) {
        try {
            System.out.print("Lütfen öğrencinin ismini giriniz: ");
            String isim = input.nextLine();
            ogrenci.setIsim(isim);
            dosyaIslemleri.dosyayaYaz(isim + ",\n", "OgrenciKayitlari.txt");

            System.out.print("Lütfen öğrencinin soyismini giriniz: ");
            String soyIsim = input.nextLine();
            ogrenci.setSoyIsim(soyIsim);
            dosyaIslemleri.dosyayaYaz(soyIsim + ",\n", "OgrenciKayitlari.txt");

            System.out.print("Lütfen öğrencinin yaşını giriniz: ");
            int yas = Integer.parseInt(input.nextLine());
            ogrenci.setYas(yas);
            dosyaIslemleri.dosyayaYaz(yas + ",\n", "OgrenciKayitlari.txt");

            System.out.print("Lütfen öğrencinin okul ismini giriniz: ");
            String okulIsmi = input.nextLine();
            ogrenci.setOkulIsmi(okulIsmi);
            dosyaIslemleri.dosyayaYaz(okulIsmi + ",\n", "OgrenciKayitlari.txt");

            System.out.print("Lütfen öğrencinin sınıfını giriniz: ");
            String sinifIsmi = input.nextLine();
            ogrenci.setSinifIsmi(sinifIsmi);
            dosyaIslemleri.dosyayaYaz(sinifIsmi + ",\n", "OgrenciKayitlari.txt");

            System.out.println("Öğrenci kaydı başarıyla gerçekleştirildi.\n");
        } catch (NumberFormatException e) {
            System.err.println("Geçersiz yaş girişi. Lütfen bir sayı girin.");
        }
    }
}
