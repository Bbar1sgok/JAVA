import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DosyaIslemleri {

    // Dosyaya veri yazma
    public void dosyayaYaz(String data, String dosyaIsmi) {
        File dosya = new File(dosyaIsmi);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosya, true))) {
            writer.write(data);
        } catch (IOException e) {
            System.err.println("Dosyaya yazma hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Dosyadaki verileri okuma (Satır satır okuma)
    public List<String> oku(String dosyaIsmi) {
        File dosya = new File(dosyaIsmi);
        List<String> satirlar = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(dosya))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                satirlar.add(satir);
            }
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
            e.printStackTrace();
        }
        return satirlar;
    }

    // Dosyadaki tüm verileri silme
    public void dosyayiSil(String dosyaIsmi) {
        File dosya = new File(dosyaIsmi);
        if (dosya.exists()) {
            if (dosya.delete()) {
                System.out.println(dosyaIsmi + " dosyası başarıyla silindi.");
            } else {
                System.err.println(dosyaIsmi + " dosyası silinemedi.");
            }
        } else {
            System.err.println(dosyaIsmi + " dosyası bulunamadı.");
        }
    }
}