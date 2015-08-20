/**
 * Created by GillesCallebautPC on 20-Aug-15.
 */
public class Kok {
    private String naam = "Anoniempje";
    private String vrijeDag = "Geen";

    public Kok() {}

    public Kok(String naam, String vrijeDag) {
        this.naam = naam;
        this.vrijeDag = vrijeDag;
    }

    public String getVrijeDag() {
        return vrijeDag;
    }

    public void setVrijeDag(String vrijeDag) {
        this.vrijeDag = vrijeDag;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Kok{" +
                "naam='" + naam + '\'' +
                ", vrijeDag='" + vrijeDag + '\'' +
                '}';
    }
}
