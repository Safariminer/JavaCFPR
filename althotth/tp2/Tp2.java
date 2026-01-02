package althotth.tp2;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Tp2 {

    public static java.util.Map<String, int[]> equipes;

    public static void ajouterNouveauMatch(Scanner in){
    
        while(true){
            String equipeVisit = "", equipeLocal = "";
            int butsVisit = 0, butsLocal = 0;
        
            System.out.print("Équipe visiteuse : ");
            equipeVisit = in.nextLine().toUpperCase();
            
            System.out.print("Nombre de buts : ");
            butsVisit = in.nextInt();
            
            in.nextLine();

            System.out.print("Équipe locale : ");
            equipeLocal = in.nextLine().toUpperCase();
            
            System.out.print("Nombre de buts : ");
            butsLocal = in.nextInt();
            in.nextLine();

            calculerPoints(equipeVisit, equipeLocal, butsVisit, butsLocal);
            
            System.out.print("Voulez-vous entrer un autre résultat? (o/n) : ");

            String choix;

            do{
                choix = in.nextLine();
            } while(!choix.equals("o") && !choix.equals("n"));
            if(choix.equals("n")) return;

        }
        
    }
    
    static String afficherEspaces(int nombreEspaces){
        String espaces = "";
        for(int i = 0; i < nombreEspaces; i++){
            espaces += " ";
        }
        return espaces;
    }

    public static void calculerPoints(String equipeVisit, String equipeLocal, int butsVisit, int butsLocal){
        if(!equipes.containsKey(equipeVisit)) {
            System.out.println("Équipe visiteuse incorrecte.");
        }
        else if(!equipes.containsKey(equipeLocal)) {
            System.out.println("Équipe locale incorrecte.");
        }
        else if(equipeVisit.equals(equipeLocal)){
            System.out.println("L'équipe ne peut pas jouer contre elle-même.");
        }
        else {
            equipes.get(equipeVisit)[0]++;
            equipes.get(equipeLocal)[0]++;

            if(butsVisit > butsLocal){
                equipes.get(equipeVisit)[1]++;
                equipes.get(equipeLocal)[2]++;

                equipes.get(equipeVisit)[4] += 3;
            }
            
            else if(butsLocal > butsVisit){
                equipes.get(equipeLocal)[1]++;
                equipes.get(equipeVisit)[2]++;

                equipes.get(equipeLocal)[4] += 3;
            }
            else{
                
                equipes.get(equipeLocal)[3]++;
                equipes.get(equipeVisit)[3]++;
                
                equipes.get(equipeVisit)[4] += 1;
                equipes.get(equipeLocal)[4] += 1;
            }
        }
    }

    public static void afficherClassement(){
        System.out.println("Classement");
        System.out.println();

        String[] siglesEquipes = {"MON", "QUE", "LAV", "TER"};

        int maxParties = 2;
        int maxVictoires = 2;
        int maxDefaites = 2;
        int maxNulles = 2;
        int maxPoints = 3;

        for(String equipe : siglesEquipes){
            int[] resultats = equipes.get(equipe);
            
            maxParties = String.valueOf(resultats[0]).length() > maxParties ? String.valueOf(resultats[0]).length() : maxParties;
            maxVictoires = String.valueOf(resultats[1]).length() > maxVictoires ? String.valueOf(resultats[1]).length() : maxVictoires;
            maxDefaites = String.valueOf(resultats[2]).length() > maxDefaites ? String.valueOf(resultats[2]).length() : maxDefaites;
            maxNulles = String.valueOf(resultats[3]).length() > maxNulles ? String.valueOf(resultats[3]).length() : maxNulles;
            maxPoints = String.valueOf(resultats[4]).length() > maxPoints ? String.valueOf(resultats[4]).length() : maxPoints;
        }

        String entete = "Équipe " + 
        afficherEspaces(maxParties - 2) + "PJ" + 
        afficherEspaces(maxVictoires - 1) + "V" +
        afficherEspaces(maxDefaites - 1) + "D" +
        afficherEspaces(maxNulles - 1) + "N" +
        afficherEspaces(maxPoints - 3) + " PTS";

        System.out.println(entete);
        for(int i = 0; i < entete.length(); i++) System.out.print("-");
        System.out.println();
        
        for(String equipe : siglesEquipes){
            int[] resultats = equipes.get(equipe);

            System.out.print(afficherEspaces(3));
            System.out.print(equipe);

            System.out.print(afficherEspaces(maxParties - String.valueOf(resultats[0]).length()));
            System.out.print(resultats[0]);

            System.out.print(afficherEspaces(maxVictoires - String.valueOf(resultats[1]).length()));
            System.out.print(resultats[1]);
            
            System.out.print(afficherEspaces(maxDefaites - String.valueOf(resultats[2]).length()));
            System.out.print(resultats[2]);
            
            System.out.print(afficherEspaces(maxNulles - String.valueOf(resultats[3]).length()));
            System.out.print(resultats[3]);
            
            System.out.print(afficherEspaces(maxPoints - String.valueOf(resultats[4]).length()));
            System.out.print(resultats[4]);
            System.out.println();

        }
        
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("TRAVAIL PRATIQUE #2 - Thomas Althot");
        System.out.println("-----------------------------------");
        
        equipes = new HashMap<>();

        equipes.put("MON", new int[]{0,0,0,0,0});
        equipes.put("QUE", new int[]{0,0,0,0,0});
        equipes.put("LAV", new int[]{0,0,0,0,0});
        equipes.put("TER", new int[]{0,0,0,0,0});


        ajouterNouveauMatch(in);

        afficherClassement();

        in.close();
    }
}
