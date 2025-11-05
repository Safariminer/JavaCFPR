package althotth.at02;

import java.util.*;

public class At02Ex04 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in); 
        int nombre;
        do{
            System.out.print("Entrez un nombre entre 0 et 100 >>> ");
            nombre = entree.nextInt();
        } while(nombre > 100 || nombre < 0);
        entree.close();
    }
}
