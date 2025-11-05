package althotth.at01;

import java.util.Scanner;

public class At01Ex04 {
    public static void main(String[] args) {
        Scanner entreeUtilisateur = new Scanner(System.in);

        System.out.print("Note >>> "); float note = entreeUtilisateur.nextFloat();
        System.out.print((note >= 60 ? "L'élève passe" : "L'élève coule"));

        entreeUtilisateur.close();
    }
}
