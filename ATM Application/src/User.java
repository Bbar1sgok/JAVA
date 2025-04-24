public class User {
    private String kullaniciIsmi;
    private String sifre;

    public User(String kullaniciIsmi, String sifre){
        this.kullaniciIsmi = kullaniciIsmi;
        this.sifre = sifre;
    }

    // Kullanıcı İsmi
    public String getKullaniciIsmi() {
        return kullaniciIsmi;
    }

    // Şifre
    public String getSifre() {
        return sifre;
    }
}
