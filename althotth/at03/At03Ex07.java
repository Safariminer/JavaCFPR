package althotth.at03;

public class At03Ex07 {
    static void afficherTableau(int[] tableau){
        for(int i = 0; i < tableau.length; i++){
            System.out.println(i + ":" + tableau[i]);
        }
    }
    public static void main(String[] args) {
        int[] tableau = new int[10];
        for(int i = 0; i < 10; i++) tableau[i] = (int)(Math.random()*4);
        int[] apparitions = new int[5];
        for(int n : tableau) apparitions[n]++;
        System.out.println("Tableau:");
        afficherTableau(tableau);
        System.out.println("Occurences:");
        afficherTableau(apparitions);
    }
}
