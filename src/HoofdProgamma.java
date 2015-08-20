import java.util.Scanner;

/**
 * Created by GillesCallebautPC on 20-Aug-15.
 */
public class HoofdProgamma {
    private static Restaurant[] restaurants;
    private static Kok[] koks;

    public static void main(String[] args) {
        // Toevoegen van drie koks
        Kok k1, k2, k3;

        // Kok constructor: (naam, vrijedag)
        k1 = new Kok("Jeroen", "maandag");
        k2 = new Kok("Wout", "dinsdag");
        k3 = new Kok("Piet", "donderdag");

        koks = new Kok[]{k1,k2,k3};

        // Toevoegen drie restaurants


        // Restaurant constructor: (gerechtString, naam, kok, periodeNiet)
        Restaurant r1,r2,r3;
        r1 = new Restaurant("Vlaams Konijn", "In het huppelend konijn", k1 ,"18-40");
        r2 = new Restaurant("zalm op oosterse wijze", "de vliegende zalm", k2, "14-27");
        r3 = new Restaurant("Griekse salade", "In het huppelend konijn", k3, "40-09");

        //voor straks het mij makkelijk te maken ga ik ze in een array zetten kan ik ze snel via een lus doorlopen
        restaurants = new Restaurant[]{r1,r2,r3};

        try{
            System.out.println(maakReservatie());
        }catch (KokNietVrijException knve){
            System.out.println(knve.getMessage());
        }catch (GerechtNietBeschikbaarException gnbe){
            System.out.println(gnbe.getMessage());
        }


    }

    private static String maakReservatie() throws KokNietVrijException, GerechtNietBeschikbaarException {
        Scanner sc = new Scanner(System.in);

        // keuze restaurant
        for(int i=0;i<restaurants.length;i++){
            System.out.println("voor restaurant "+restaurants[i].getNaam()+", tik "+(i+1)+" in");
        }

        int keuze = Integer.parseInt(sc.nextLine());
        // -1 vermits index begint met 0 in array maar niet bij restaurant
        Restaurant gekozenRestaurant = restaurants[keuze-1];

        // keuze dag
        String keuzeDag = sc.nextLine();

        // keuze week
        int keuzeWeek = Integer.parseInt(sc.nextLine());

        // fouten zoeken
        // kok niet beschikbaar
        if(koks[keuze-1].getVrijeDag().equals(keuzeDag)) throw new KokNietVrijException("Kok is niet vrij");

        // gerecht niet beschikbaar
        if(!restaurants[keuze-1].getSpecialiteit().isBeschikbaar(keuzeWeek)) throw new GerechtNietBeschikbaarException("Het gerecht is niet beschikbaar");

        return "Restaurant: " + restaurants[keuze-1];
    }
}
