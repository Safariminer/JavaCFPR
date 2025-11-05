package althotth.at02;

import java.util.*;

public class At02Ex08 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        ArrayList<String> mots = new ArrayList<String>();

        while(true){
            String mot = entree.nextLine().toLowerCase();
            if(mot.equals("stop")) {
                break;
            }
            mots.add(mot);
        }

        mots.sort(null);

        System.out.println("Premier mot (ordre alphabétique) : " + mots.getFirst());
        System.out.println("Dernier mot (ordre alphabétique) : " + mots.getLast());

        entree.close();

    }
}
