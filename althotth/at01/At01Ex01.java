package althotth.at01;

import java.util.*;

public class At01Ex01 {

    public static void main(String[] args) {
        Scanner entreeUtilisateur = new Scanner(System.in);
        
        float nombre1 = entreeUtilisateur.nextFloat(), nombre2 = entreeUtilisateur.nextFloat();
        if(nombre1 > nombre2) System.out.print(nombre1);
        else System.out.print(nombre2);
        
        entreeUtilisateur.close();
    }
}
