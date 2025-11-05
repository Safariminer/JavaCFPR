package althotth.at02;

import java.util.*;

public class At02Ex10 {
    static int plusGrand(int a, int b){
        return (a < b ? b : a);
    }
    public static void main(String[] args) {
        int a, b;
        Scanner entree = new Scanner(System.in);
        System.out.print("Entrer un nombre entier >> "); a = entree.nextInt();
        System.out.print("Entrer un nombre entier >> "); b = entree.nextInt();
        System.out.println("Plus gros nombre : " + plusGrand(a,b));
        entree.close();
    }
}
