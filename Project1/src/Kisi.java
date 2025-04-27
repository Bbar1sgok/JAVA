public class Kisi {

    private String isim;
    private String soyIsim;
    private int yas;
    private String okulIsmi;

    public Kisi(String isim, String soyIsim, int yas, String okulIsmi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.okulIsmi = okulIsmi;
    }

    public Kisi() {
    }

    // İsim
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    // Soy İsim
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    // Yaş
    public void setYas(int yas) {
        if (yas > 0 && yas < 150) { // Daha gerçekçi yaş kontrolü
            this.yas = yas;
        } else {
            System.err.println("Geçersiz yaş girişi. Lütfen 0 ile 150 arasında bir değer giriniz.");
        }
    }

    public int getYas() {
        return yas;
    }

    // Okul İsmi
    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }
}