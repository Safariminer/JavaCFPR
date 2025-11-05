package althotth.at02;

import java.util.*;

public class At02Ex09 {
    static double circonference(double rayon){
        return 2 * Math.PI * rayon;
    }
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Insérer le rayon d'un cercle >>> ");
        System.out.printf("Rayon: %f", circonference(entree.nextDouble()));

        entree.close();
    }
}
