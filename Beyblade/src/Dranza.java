public class Dranza extends Beyblade {

    private String kutsalCanavar;

    //Constructor
    public  Dranza(String beyblade, int donushizi, int saldiriGucu, String kutsalCanavar) {
        super(beyblade, donushizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster(){

        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar);

    }

    @Override
    public void kutsalCanavarOrtayaCikar(){

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkar...");
        System.out.println(getBeybladeci() + " nin saldırısı : Alev Kılıcı");

    }

}
