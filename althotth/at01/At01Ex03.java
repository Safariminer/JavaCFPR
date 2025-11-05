package althotth.at01;

import java.util.*;

public class At01Ex03 {
    public static void main(String[] args) {
        Scanner entreeUtilisateur = new Scanner(System.in);

        System.out.print("Âge 1 >>>"); float age1 = entreeUtilisateur.nextFloat();
        System.out.print("Âge 2 >>>"); float age2 = entreeUtilisateur.nextFloat();
        System.out.printf("Moyenne: %.2f", (age1 + age2)/ 2);

        entreeUtilisateur.close();
    }
}
