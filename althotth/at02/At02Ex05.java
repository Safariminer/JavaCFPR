package althotth.at02;

public class At02Ex05 {
    public static void main(String[] args) {
        for(int lettre = 0; lettre < 52; lettre++){
            if(lettre == 26) System.out.println();
            System.out.print((char)((lettre - (lettre % 26) == 0 ? lettre : (25 - (lettre % 26)))+65));
        }
    }
}
