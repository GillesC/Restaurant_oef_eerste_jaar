/**
 * Created by GillesCallebautPC on 20-Aug-15.
 */
public class Restaurant {
    private Gerecht specialiteit;
    private String naam;
    private Kok kok;

    public Restaurant(String specialiteit, String naam, Kok kok, String periodeNietVerkrijgbaar) {
        this.specialiteit = new Gerecht(specialiteit, periodeNietVerkrijgbaar);
        this.naam = naam;
        this.kok = kok;
    }

    public Gerecht getSpecialiteit() {
        return specialiteit;
    }

    public void setSpecialiteit(Gerecht specialiteit) {
        this.specialiteit = specialiteit;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Kok getKok() {
        return kok;
    }

    public void setKok(Kok kok) {
        this.kok = kok;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "naam='" + naam + '\'' +
                ", specialiteit=" + specialiteit +
                ", kok=" + kok +
                '}';
    }
}
