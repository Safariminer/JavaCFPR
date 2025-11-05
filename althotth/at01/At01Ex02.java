package althotth.at01;

import java.util.*;

public class At01Ex02 {
    public static void main(String[] args) {
        Scanner entreeUtilisateur = new Scanner(System.in);
        
        System.out.print("Salaire horaire >>>"); float salaireHeures = entreeUtilisateur.nextFloat();
        System.out.print("Nombre d'heures >>>"); float heuresSemaine = entreeUtilisateur.nextFloat();
        System.out.printf("Salaire: %.2f", salaireHeures * heuresSemaine * 2);

        entreeUtilisateur.close();
    }
}
