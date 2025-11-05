package althotth.at02;

import java.util.*;

public class At02Ex11 {
    static int factorielle(int nombre){
        int valeur = 1;
        for(int i = 1; i <= nombre; i++){
            valeur *= i;
        }
        return valeur;
    } 

    public static void main(String[] args) {
        
        int nombre;
        Scanner entree = new Scanner(System.in);
        System.out.print("Entrer un nombre entier >> "); nombre = entree.nextInt();
        System.out.println(factorielle(nombre));
        entree.close();

    }
}
