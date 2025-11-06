package althotth.at03;

public class At03Ex05 {
    static void afficherTableau(int[] tableau, String titreTableau){
        System.out.print(titreTableau + " : ");

        for(int n : tableau) System.out.print(n + ";");

        System.out.println();
    }
    public static void main(String[] args) {
        int[] tableau = new int[10];

        for(int i = 0; i < 10; i++) tableau[i] = (int)(Math.random()*100);

        afficherTableau(tableau, "Tableau avant");

        for(int i = 0; i < tableau.length / 2; i++){
            int n = tableau[i];
            tableau[i] = tableau[(tableau.length - 1) - i];
            tableau[(tableau.length - 1) - i] = n;
        }

        afficherTableau(tableau, "Tableau après");
    }
}
