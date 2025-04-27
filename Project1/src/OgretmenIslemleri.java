public class OgretmenIslemleri extends Kisi {

    private String brans;

    public OgretmenIslemleri(String isim, String soyIsim, int yas, String okulIsmi, String brans) {
        super(isim, soyIsim, yas, okulIsmi);
        this.brans = brans;
    }

    public OgretmenIslemleri() {
    }

    // Branş
    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }
}