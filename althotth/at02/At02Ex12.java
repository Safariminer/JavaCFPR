package althotth.at02;

import java.util.Scanner;

public class At02Ex12 {
    static int sommeMinMax(int min, int max){
        int somme = 0;
        for(int i = min; i <= max; i++){
            somme += i;
        }

        return somme;
    }

    public static void main(String[] args) {
        int min, max;
        Scanner entree = new Scanner(System.in);
        System.out.print("Entrer un minimum >> "); min = entree.nextInt();
        System.out.print("Entrer un maximum >> "); max = entree.nextInt();
        System.out.println("Somme de tout: " + sommeMinMax(min,max));
        entree.close();
    }
}
