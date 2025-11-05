package althotth.at02;

import java.util.*;

public class At02Ex07 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        
        System.out.print("Veuillez saisir un mot ou une phrase >>> ");
        String phrase = entree.nextLine();
        
         // AbcdEfghIjklmnOpqrstUvwxYz
        //  1   5   9     15    21  25

        int voyelles = 0, consonnes = 0; 
        for(byte c : phrase.getBytes()){
            if(((c & (byte)0b01100000) == (byte)0b01100000) || ((c & (byte)0b01000000) == (byte)0b01000000)){
                byte lettre = (byte)(c & (byte)0b00011111);
                if(lettre <= 26){
                    switch((int)lettre){
                        case 1:
                        case 5:
                        case 9:
                        case 15:
                        case 21:
                        case 25:
                        voyelles++;
                        break;
                        default:
                        consonnes++;
                    }
                }
            }
        }
        System.out.println("Consonnes : " + consonnes);
        System.out.println("Voyelles : " + voyelles);

        entree.close();
    }
}
