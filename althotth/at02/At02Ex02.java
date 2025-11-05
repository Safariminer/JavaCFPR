package althotth.at02;

import java.util.Scanner;

public class At02Ex02 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un mot ou une phrase >>> ");
        String phrase = entree.nextLine();
        System.out.println(phrase.length());
        
        entree.close();
    }
}
