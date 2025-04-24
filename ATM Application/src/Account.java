public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    // Constructor
    public Account(){
       /* this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi Yok";
        this.email = "Bilgi Yok";
        this.telefonNo = "Bilgi Yok";*/
        this("Bilgi Yok", 0.0, "Bilgi Yok",  "Bilgi Yok", "Bilgi Yok");

    }

    // Constructor1
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

    }

    // Bilgi AL
    public void bilgiAL(){
        System.out.println("Hesap no: " + this.hesapNo);
        System.out.println("Hesap Bakiyesi: " + this.bakiye);
        System.out.println("Kullanıcı İsmi: " + this.isim);
        System.out.println("Kullanıcı E-mail: " + this.email);
        System.out.println("Kullanıcı Telefon No: " + this.telefonNo);
    }

    // Para Yatır
    public void paraYatir(double miktar){
        if(miktar > 0){
            bakiye += miktar;
        }
        else{
            System.out.println("Lütfen para ekleyiniz");
        }
        System.out.println("Yeni bakiye: " + bakiye);
    }

    // Para Çek
    public void paraCek(double miktar){
        double kalanBakiye;
        kalanBakiye = bakiye - miktar;
        if(miktar <= 5000){
            if(kalanBakiye >= 0){
                this.bakiye = kalanBakiye;
                System.out.printf("Para çekme işlemi başarıyla gerçekleşmiştir.\nHesabınızda kalan bakiye %.2f \nİyi günler dileriz...\n",kalanBakiye);
            }
            else{
                System.out.println("Para çekme işlemi gerçekleştirilememiştir.Hesabınızda yeterince para yoktur.Hesap bakiyesi: " + bakiye);
            }
        }
        else{
            System.out.println("Bir günde 5000 TL'den fazla para çekemezsiniz");
        }

    }
    // Hesap No
    public void setHesapNo(String hesapNo){
        this.hesapNo = hesapNo;
    }

    public String getHesapNo(){
        return hesapNo;
    }

    // Bakiye
    public void setBakiye(double bakiye){
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    // İsim
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    // E-mail
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Telefon No
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    public String getTelefonNo(){
        return telefonNo;
    }
}
