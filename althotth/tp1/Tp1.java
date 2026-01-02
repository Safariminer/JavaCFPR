package althotth.tp1;

import java.util.Scanner;

class Tp1{


    // paramètres jeu dollars
    final static float[] DENOMINATIONS = {
        100, 50, 20, 10, 5, 2, 1, 0.25f, 0.10f, 0.05f, 0.01f
    };


    // paramètres jeu nombre aléatoire
    final static int NOMBRE_MAX = 20;
    final static int TENTATIVES_MAX = 7;

    static void jeuDollars(Scanner in){
        float montant = -1;
        System.out.print("Entrez un nombre: ");

        montant = in.nextFloat();
        System.out.println("Montant initial : " + montant);
        for(float denomination : DENOMINATIONS){
            int compte = 0;
            while(montant - denomination >= 0){
                montant -= denomination; compte++;
            }
            if(compte > 0) System.out.println(denomination + " : " + compte);
        }
    }

    static void jeuNombreMystere(Scanner in){
        int nombre = (int)(Math.random()*NOMBRE_MAX), tentatives = 0, tentative = 0;

        do {
            if(tentative != 0) System.out.println(tentative > nombre ? "Trop haut!" : "Trop bas!");
            do {
                System.out.print("Entrez un nombre entre 1 et 20 (" + (TENTATIVES_MAX - tentatives) + " tentatives restantes) : ");
                tentative = in.nextInt();
            } while(tentative < 1 || tentative > 20);
            tentatives++;
        } while(tentatives < TENTATIVES_MAX && tentative != nombre);

        System.out.println(tentative == nombre ? ("Bravo! Vous avez trouvé le nombre mystère en " + tentatives + " tentatives!") : "Perdu!");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("TRAVAIL PRATIQUE #1 - Thomas Althot");
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("1) Transformer $$$ en monnaie");
        System.out.println("2) Jeu trouver un nombre mystère");
        System.out.println("3) Quitter");

        int choix = 0;

        do {
            System.out.print("Choix : ");
            choix = in.nextInt();
        } while(choix < 1 || choix > 3);

        switch(choix){
        case 1:
            jeuDollars(in);
            break;
        case 2:
            jeuNombreMystere(in);
            break;
        case 3:
            break;
        }

        in.close();
    }
}