public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beybladeTuru) {

        if (beybladeTuru.equals("dragon")) {
            return new Dragon("Takao", 1000, 500, "Mavi Ejderha", "Kutsal Canavarla Konuşma");

        }
        else if(beybladeTuru.equals("dranza")) {

            return new Dranza("kai", 800,400,"Kırmızı Anka Kuşu");
        }
        else if(beybladeTuru.equals("drayga")) {

            return new Dranza("Rei", 800,200,"Beyaz Kaplan");
        }
        else if(beybladeTuru.equals("draciel")) {

            return new Dranza("Max", 300,1100,"Kara Kaplumbağa");
        }
        else {
            return null;
        }
    }

}
