import java.util.Scanner;

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

    public String maakReservatie() throws KokNietVrijException, GerechtNietBeschikbaarException {
        Scanner sc = new Scanner(System.in);

        // keuze dag
        System.out.println("Keuze dag: ");
        String keuzeDag = sc.nextLine();

        // kok niet beschikbaar
        if(this.kok.getVrijeDag().equals(keuzeDag)) throw new KokNietVrijException("Kok is niet vrij");

        // keuze week
        System.out.println("Keuze week: ");
        int keuzeWeek = Integer.parseInt(sc.nextLine());

        // gerecht niet beschikbaar
        if(!this.getSpecialiteit().isBeschikbaar(keuzeWeek)) throw new GerechtNietBeschikbaarException("Het gerecht is niet beschikbaar");

        return this.toString();
    }
}
