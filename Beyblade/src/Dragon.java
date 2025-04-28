public class Dragon extends Beyblade{

    private String kutsalCanavar;
    private String gizliyetenek;

    //Constructor
    public  Dragon(String beyblade, int donushizi, int saldiriGucu, String kutsalCanavar, String gizliyetenek) {
        super(beyblade, donushizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void bilgileriGoster(){

        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı: " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliyetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar(){

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkar...");
        System.out.println(getBeybladeci() + " nin saldırısı : Hayalet Kasırgası");

    }

}
