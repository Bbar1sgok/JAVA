public class Beyblade {

    private String beybladeci;
    private int donushizi;
    private int saldiriGucu;

    //Construtor
    public Beyblade(String beyblade, int donushizi, int saldiriGucu) {
        this.beybladeci = beyblade;
        this.donushizi = donushizi;
        this.saldiriGucu = saldiriGucu;
    }

    // Beyblade
    public void setBeybladeci(String beyblade) {
        this.beybladeci = beyblade;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    // Dönüş Hızı
    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getDonushizi() {
        return donushizi;
    }

    // Saldırı Gücü
    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void saldiriYap(){

        System.out.printf(beybladeci + " " + saldiriGucu + " ve " + donushizi + " ile saldırıyor...\n");

    }

    public void kutsalCanavarOrtayaCikar(){

        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor.\n");

    }

    public void bilgileriGoster(){

        System.out.println("*********** Bilgiler Gösteriliyor ************ \n"+
                "Beyblade İsmi : " + beybladeci +
                "\nBeyblade Hızı : " + donushizi+
                "\nBeyblade Gücü :  " + saldiriGucu);

    }


}
