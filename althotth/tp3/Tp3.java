package althotth.tp3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Tp3 {
    
    // liste de livres
    static List<Livre> livres = new ArrayList<Livre>();

    
    // ajouter un livre dans la liste des livres
    static void ajouterLivre(Scanner in){

        // nouvel objet livre
        Livre livre = new Livre();

        // titre et auteur
        System.out.print("Titre du livre: ");
        livre.titre = in.nextLine();

        System.out.print("Auteur du livre: ");
        livre.auteur = in.nextLine();


        // gestion des catégories
        System.out.print("Catégorie du livre [ (F)iction / (S)cience / (B)iographie]: ");

        String choix = in.nextLine().toUpperCase();
        while(!choix.equals("F") && !choix.equals("S") && !choix.equals("B")){
            System.out.println("Catégorie incorrecte.");
            System.out.print("Catégorie du livre [ (F)iction / (S)cience / (B)iographie]: ");
            choix = in.nextLine().toUpperCase();
        }

        // parsing de la catégorie
        if(choix.equals("F")) livre.categorie = Livre.Categorie.CATEGORIE_FICTION;
        if(choix.equals("S")) livre.categorie = Livre.Categorie.CATEGORIE_SCIENCE;
        if(choix.equals("B")) livre.categorie = Livre.Categorie.CATEGORIE_BIOGRAPHIE;

        System.out.print("Année de sortie: ");

        String anneeString = in.nextLine();

        boolean entierTrouve = false;
        while(!entierTrouve){
            try{
                livre.anneePublication = (short)Integer.parseInt(anneeString);
                entierTrouve = true;
            }
            catch(Exception e){
                System.out.println("L'année doit être un nombre entier valide.");
                System.out.print("Année de sortie: ");
                anneeString = in.nextLine();
            }
        }

        livres.add(livre);

    }

    // afficher tous les livres
    public static void afficherLivres(){
        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque.");
            return;
        }
        else{
            int idReservation = 0;
            for(Livre l : livres){
                System.out.println(idReservation + " « " + l.titre + " », écrit par " + l.auteur 
                                    + ", sorti en " + l.anneePublication + 
                                    " [" + (
                                        l.categorie == Livre.Categorie.CATEGORIE_BIOGRAPHIE ? "Biographie" :
                                        l.categorie == Livre.Categorie.CATEGORIE_FICTION    ? "Fiction" :
                                        l.categorie == Livre.Categorie.CATEGORIE_SCIENCE    ? "Science" :
                                      /*l.categorie == Livre.Categorie.CATEGORIE_INCONNU   */ "Inconnu" 
                                    ) + "]");
                if(l.disponible == false){
                    System.out.println("     RÉSERVÉ");
                }
                idReservation++;
            }
        }
    }

    // rechercher par titre
    public static void rechercher(Scanner in){
        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque.");
            return;
        }
        else{


            System.out.print("Titre >>> ");
            String recherche = in.nextLine().toLowerCase();

            int idReservation = 0;
            for(Livre l : livres){
                if(l.titre.toLowerCase().contains(recherche)){
                    System.out.println(idReservation + " « " + l.titre + " », écrit par " + l.auteur 
                                        + ", sorti en " + l.anneePublication + 
                                        " [" + (
                                            l.categorie == Livre.Categorie.CATEGORIE_BIOGRAPHIE ? "Biographie" :
                                            l.categorie == Livre.Categorie.CATEGORIE_FICTION    ? "Fiction" :
                                            l.categorie == Livre.Categorie.CATEGORIE_SCIENCE    ? "Science" :
                                          /*l.categorie == Livre.Categorie.CATEGORIE_INCONNU   */ "Inconnu" 
                                        ) + "]");
                    if(l.disponible == false){
                        System.out.println("     RÉSERVÉ");
                    }
                }
                idReservation++;
            }
        }
    }

    // supprimer un livre
    public static void supprimerLivre(Scanner in){

        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque");
            return;
        }

        System.out.print("Entrer l'identifiant d'un livre à supprimer >>> ");
        String idString = in.nextLine();

        boolean entierTrouve = false;
        int idLivre = 0;
        while(!entierTrouve){
            try{
                idLivre = (short)Integer.parseInt(idString);
                entierTrouve = true;
            }
            catch(Exception e){
                System.out.println("L'ID doit être un nombre entier valide.");
                
                System.out.print("Entrer l'identifiant d'un livre à supprimer >>> ");
                idString = in.nextLine();
            }
        }


        if(idLivre >= livres.size()){
            System.out.println("Ce livre n'existe pas");
            return;
        }

        livres.remove(idLivre);
        
    }

    // rechercher par catégorie
    public static void afficherCategorie(Scanner in){
        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque.");
            return;
        }
        else{


            System.out.print("Catégorie (F/S/B) >>> ");
            String recherche = in.nextLine().toLowerCase();

            Livre.Categorie categorie;

            while(!recherche.equals("f") && !recherche.equals("s") && !recherche.equals("b")){
                System.out.println("Catégorie incorrecte");

                System.out.print("Catégorie (F/S/B) >>> ");
                recherche = in.nextLine().toLowerCase();

            }


            categorie = recherche.equals("f") ? Livre.Categorie.CATEGORIE_FICTION : recherche.equals("s") ? Livre.Categorie.CATEGORIE_SCIENCE : Livre.Categorie.CATEGORIE_BIOGRAPHIE;


            int idReservation = 0;
            for(Livre l : livres){
                if(l.categorie == categorie){
                    System.out.println(idReservation + " « " + l.titre + " », écrit par " + l.auteur 
                                        + ", sorti en " + l.anneePublication + 
                                        " [" + (
                                            l.categorie == Livre.Categorie.CATEGORIE_BIOGRAPHIE ? "Biographie" :
                                            l.categorie == Livre.Categorie.CATEGORIE_FICTION    ? "Fiction" :
                                            l.categorie == Livre.Categorie.CATEGORIE_SCIENCE    ? "Science" :
                                          /*l.categorie == Livre.Categorie.CATEGORIE_INCONNU   */ "Inconnu" 
                                        ) + "]");
                    if(l.disponible == false){
                        System.out.println("     RÉSERVÉ");
                    }
                }
                idReservation++;
            }
        }
    }


    // réserver un livre
    public static void reserver(Scanner in){

        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque");
            return;
        }

        System.out.print("Entrer l'identifiant d'un livre à réserver >>> ");
        String idString = in.nextLine();

        boolean entierTrouve = false;
        int idLivre = 0;
        while(!entierTrouve){
            try{
                idLivre = (short)Integer.parseInt(idString);
                entierTrouve = true;
            }
            catch(Exception e){
                System.out.println("L'ID doit être un nombre entier valide.");
                
                System.out.print("Entrer l'identifiant d'un livre à réserver >>> ");
                idString = in.nextLine();
            }
        }


        if(idLivre >= livres.size()){
            System.out.println("Ce livre n'existe pas");
            return;
        }

        livres.get(idLivre).disponible = true;
        
    }


    // retourner un livre
    public static void retourner(Scanner in){

        if(livres.size() == 0){
            System.out.println("Il n'y a aucun livre dans la bibliothèque");
            return;
        }

        System.out.print("Entrer l'identifiant d'un livre à retourner >>> ");
        String idString = in.nextLine();

        boolean entierTrouve = false;
        int idLivre = 0;
        while(!entierTrouve){
            try{
                idLivre = (short)Integer.parseInt(idString);
                entierTrouve = true;
            }
            catch(Exception e){
                System.out.println("L'ID doit être un nombre entier valide.");
                
                System.out.print("Entrer l'identifiant d'un livre à retourner >>> ");
                idString = in.nextLine();
            }
        }


        if(idLivre >= livres.size()){
            System.out.println("Ce livre n'existe pas");
            return;
        }

        livres.get(idLivre).disponible = false;
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        String choix; 

        System.out.print("Il n'y a pas de livre dans la bibliothèque. Ajouter un livre? (o/n) >>> ");
        choix = in.nextLine().toUpperCase();
        while(!choix.equals("O") && !choix.equals("N")){
            System.out.println("Choix incorrect");
            System.out.print("Il n'y a pas de livre dans la bibliothèque. Ajouter un livre? (o/n) >>> ");
            choix = in.nextLine().toUpperCase();
        }
        if(choix.equals("O")) ajouterLivre(in);



        boolean fonction = true;


        System.out.println("COMMANDES: ajouter, afficher, rechercher, supprimer, affichercategorie, reserver, retourner, quitter");


        while(fonction){
            System.out.print(">>> ");
            choix = in.nextLine().toLowerCase();


            if(choix.equals("ajouter")){
                ajouterLivre(in);
            }
            else if(choix.equals("afficher")){
                afficherLivres();
            }
            else if(choix.equals("rechercher")){
                rechercher(in);
            }
            else if(choix.equals("supprimer")){
                supprimerLivre(in);
            }
            else if(choix.equals("affichercategorie")){
                afficherCategorie(in);
            }
            else if(choix.equals("reserver")){
                reserver(in);
            }
            else if(choix.equals("retourner")){
                retourner(in);
            }
            else if(choix.equals("quitter")){
                fonction = false;
            }
            else {
                System.out.println("Commande invalide");
            }

        }


        in.close();
    }
}
