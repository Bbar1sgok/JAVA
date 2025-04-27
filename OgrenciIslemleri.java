public class OgrenciIslemleri extends Kisi {

    private String sinifIsmi;

    public OgrenciIslemleri(String isim, String soyIsim, int yas, String okulIsmi) {
        super(isim, soyIsim, yas, okulIsmi);
        this.sinifIsmi = sinifIsmi;
    }

    public OgrenciIslemleri() {
    }

    // Sınıf İsmi
    public void setSinifIsmi(String sinifIsmi) {
        this.sinifIsmi = sinifIsmi;
    }

    public String getSinifIsmi() {
        return sinifIsmi;
    }
}