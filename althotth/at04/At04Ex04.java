package althotth.at04;

public class At04Ex04 {


    static int[] ajouter(int[] tableau, int valeur){
        int[] retour = new int[tableau.length + 1];
        System.arraycopy(tableau, 0, retour, 0, tableau.length);
        retour[tableau.length] = valeur;
        return retour;
    }

    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5};
        tableau = ajouter(tableau, 6);
        System.out.println(tableau[5]);
    }
}
