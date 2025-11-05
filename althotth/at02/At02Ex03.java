package althotth.at02;

import java.util.Scanner;

public class At02Ex03 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un mot ou une phrase >>> ");
        String phrase = entree.nextLine().toUpperCase();
        int nombreA = 0;
        for(int i = 0; i < phrase.length(); i++){
            if(phrase.charAt(i) == 'A') nombreA++;
        }
        phrase = phrase.replace('A', '$');
        System.out.println(nombreA);
        System.out.println(phrase);
        
        entree.close();
    }
}
