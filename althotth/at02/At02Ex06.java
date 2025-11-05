package althotth.at02;

import java.util.*;

public class At02Ex06 {
    public static void main(String[] args) {
        
        Scanner entree = new Scanner(System.in);
        
        ArrayList<Integer> nombres = new ArrayList<Integer>();

        do {
            nombres.add(entree.nextInt());
        } while(nombres.getLast() != 0);

        nombres.removeLast();
        nombres.sort(null);
        System.out.printf("Plus gros nombre: %d\nPlus petit nombre: %d\n", (int)nombres.getLast(), (int)nombres.getFirst());
        
        float moyenne = 0;

        for(int i = 0; i < nombres.size(); i++) moyenne += nombres.get(i);
        moyenne = moyenne / nombres.size();
        System.out.printf("Moyenne: %f\n", moyenne);
        entree.close();
    }
}
