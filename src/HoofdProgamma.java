import java.util.Scanner;

/**
 * Created by GillesCallebautPC on 20-Aug-15.
 */
public class HoofdProgamma {
    private static Restaurant[] restaurants;

    public static void main(String[] args) {
        // Toevoegen van drie koks
        Kok k1, k2, k3;

        // Kok constructor: (naam, vrijedag)
        k1 = new Kok("Jeroen", "maandag");
        k2 = new Kok("Wout", "dinsdag");
        k3 = new Kok("Piet", "donderdag");

        // Toevoegen drie restaurants


        // Restaurant constructor: (gerechtString, naam, kok, periodeNiet)
        Restaurant r1,r2,r3;
        r1 = new Restaurant("Vlaams Konijn", "In het huppelend konijn", k1 ,"18-40");
        r2 = new Restaurant("zalm op oosterse wijze", "de vliegende zalm", k2, "14-27");
        r3 = new Restaurant("Griekse salade", "In het huppelend konijn", k3, "40-09");

        //voor straks het mij makkelijk te maken ga ik ze in een array zetten kan ik ze snel via een lus doorlopen
        restaurants = new Restaurant[]{r1,r2,r3};

        String reservatieTekst = maakReservatie();
       if(reservatieTekst!=null) System.out.println(reservatieTekst);



    }

    private static String maakReservatie(){
        Scanner sc = new Scanner(System.in);

        // keuze restaurant
        for(int i=0;i<restaurants.length;i++){
            System.out.println("voor restaurant "+restaurants[i].getNaam()+", tik "+(i+1)+" in");
        }

        int keuze = Integer.parseInt(sc.nextLine());
        // -1 vermits index begint met 0 in array maar niet bij restaurant
        Restaurant gekozenRestaurant = restaurants[keuze-1];

        try{
            return gekozenRestaurant.maakReservatie();
        }catch (KokNietVrijException knve){
            System.out.println(knve.getMessage());
        }catch (GerechtNietBeschikbaarException gnbe){
            System.out.println(gnbe.getMessage());
        }


        return null;
    }
}
