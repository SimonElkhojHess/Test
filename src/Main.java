import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Velkomst Hilsen
        System.out.println("Velkommen til gæt et tal spil");

        //tænk på et tal (1-100)

        Random rand = new Random();
        int tal = rand.nextInt(100)+1; //Tilfældigt tal mellem 1 & 100
        int gaet;

        do {

            // bed om et gæt
            System.out.println("Indtast gæt:");
            Scanner sc = new Scanner(System.in);
            gaet = sc.nextInt();

            //hvis gæt er højere end tal, så skriv "dit gæt er for højt"

            if (gaet > tal)
                System.out.println("Dit gæt er for højt");

            // hvis gæt er lavere end tal, så skriv "dit gæt er for lavt"

            if (gaet < tal)
                System.out.println("Dit gæt er for lavt");

        } while (gaet != tal);

        //Hvis gæt er rigtigt, så skriv "dit gæt er korrekt"

        if (gaet == tal)
            System.out.println("Dit gæt er korrekt");

        //Hvis gæt er forskelligt fra tal gå til 2.lk


    }
}
