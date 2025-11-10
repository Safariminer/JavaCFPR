package althotth.at04;

public class At04Ex05 {
    static int[] supprimer(int[] tableau, int index){
        int[] retour = new int[tableau.length - 1];
        if(index > 0) System.arraycopy(tableau, 0, retour, 0, index);
        if(index < tableau.length - 1) System.arraycopy(tableau, index + 1, retour, index, tableau.length - index - 1);
        return retour;
    }

    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5};
        tableau = supprimer(tableau, 0);
        System.out.println(tableau[0]);
    }
}
