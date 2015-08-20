/**
 * Created by GillesCallebautPC on 20-Aug-15.
 */
public class Gerecht {
    private String naam;
    private int beginPeriodeNietVerkijgbaar; //inclusief
    private int eindePeriodeNietVerkrijgbaar; //inclusief
    //private String periodeNietVerkrijgbaar; //voorbeeld: 05-07 (week 5 tem week7)



    public Gerecht(String naam, String periodeNietVerkrijgbaar) {
        this.naam = naam;
        // periode niet verkrijgbaar opsplitsen
        String[] periode = periodeNietVerkrijgbaar.split("-");
        beginPeriodeNietVerkijgbaar = Integer.parseInt(periode[0]); // eerste getalleke voor '-'
        eindePeriodeNietVerkrijgbaar = Integer.parseInt(periode[1]); // tweede getalleke na '-'
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getBeginPeriodeNietVerkijgbaar() {
        return beginPeriodeNietVerkijgbaar;
    }

    public void setBeginPeriodeNietVerkijgbaar(int beginPeriodeNietVerkijgbaar) {
        this.beginPeriodeNietVerkijgbaar = beginPeriodeNietVerkijgbaar;
    }

    public int getEindePeriodeNietVerkrijgbaar() {
        return eindePeriodeNietVerkrijgbaar;
    }

    public void setEindePeriodeNietVerkrijgbaar(int eindePeriodeNietVerkrijgbaar) {
        this.eindePeriodeNietVerkrijgbaar = eindePeriodeNietVerkrijgbaar;
    }

    public boolean isBeschikbaar(int week) {
        // als week binnen begin en einde valt is het niet beschikbaar
        return (week>beginPeriodeNietVerkijgbaar && week<eindePeriodeNietVerkrijgbaar);
    }

    @Override
    public String toString() {
        return "Gerecht{" +
                "naam='" + naam + '\'' +
                ", beginPeriodeNietVerkijgbaar=" + beginPeriodeNietVerkijgbaar +
                ", eindePeriodeNietVerkrijgbaar=" + eindePeriodeNietVerkrijgbaar +
                '}';
    }
}
