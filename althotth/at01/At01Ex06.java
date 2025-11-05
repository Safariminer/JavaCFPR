package althotth.at01;

import java.util.*;

public class At01Ex06 {


    static void Titre(String titre){
        String barriere = "+";
        for(int i = 0; i < titre.length() + 2; i++) barriere += "-";
        barriere = barriere + "+";
        System.out.println(barriere + "\n| " + titre + " |\n" + barriere);
    }

    static void Champ(String nom, String valeur){
        String barriere = "";
        for(int i = 0; i < nom.length() + 3; i++) barriere += " "; barriere += "+";
        for(int i = 0; i < valeur.length() + 2; i++) barriere += "-";
        barriere = barriere + "+";
        System.out.println(barriere + "\n" + nom + " : | " + valeur + " |\n" + barriere);
    }


    public static void main(String[] args) {

        float[] prix = new float[3];
        prix[0] = 5; // chêne
        prix[1] = 12; // érable
        prix[2] = 10; // pin
        

        Scanner entreeUtilisateur = new Scanner(System.in);

        Titre("BoisFranc - Bienvenue");

        System.out.print("Nom du client >>> ");
        String nomUtilisateur = entreeUtilisateur.nextLine();
        
        Titre("BoisFranc - Choix du plancher");

        int plancher = 0;
        boolean erreur = false;
        do{
            if(erreur) System.out.print("Vous n'avez pas choisi le bon type de plancher!\n");
            System.out.print("Sélectionner un bois (1. Chêne ; 2. Érable ; 3. Pin) >>> ");
            plancher = entreeUtilisateur.nextInt();
            erreur = true;
        } while(plancher < 1 || plancher > 3);


        System.out.print("Longueur du plancher >>> "); float longueur = entreeUtilisateur.nextFloat();
        System.out.print("Largeur du plancher >>> ");  float largeur  = entreeUtilisateur.nextFloat();
        

        Titre("BoisFranc - Soumission");

        Champ("Nom du client", nomUtilisateur);
        Champ("Bois sélectionné", (plancher == 1 ? "Chêne" : plancher == 2 ? "Érable" : "Pin"));
        Champ("Aire du plancher", String.format("%.3fm²", longueur*largeur));
        Champ("Prix", String.format("%.2f $", (largeur*longueur)*(prix[plancher-1])));

        entreeUtilisateur.close();
    }
}
