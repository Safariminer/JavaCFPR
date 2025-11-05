package althotth.at01;

import java.util.*;

public class At01Ex05 {
    public static void main(String[] args) {
        Scanner entreeUtilisateur = new Scanner(System.in);

        System.out.print("Montant >>>"); float montant = entreeUtilisateur.nextFloat();
        System.out.printf("Montant avec rabais: %.2f$", montant * 0.75);

        entreeUtilisateur.close();
    }
}
