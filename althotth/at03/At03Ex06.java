package althotth.at03;

public class At03Ex06 {
    public static void main(String[] args) {
        int[] tableau = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};

        // A
        {
            int sommePositif = 0, sommeNegatif = 0;

            for(int n : tableau){
                if(n < 0) sommeNegatif += n;
                else sommePositif += n;
            }

            System.out.println("Somme positive: " + sommePositif);
            System.out.println("Somme négative: " + sommeNegatif);
        }

        // B
        {
            for(int i = 0; i < 10; i++) tableau[i] = (int)(Math.random() * 200) - 100;
            int sommePositif = 0, sommeNegatif = 0;

            for(int n : tableau){
                if(n < 0) sommeNegatif += n;
                else sommePositif += n;
            }

            System.out.println("Somme positive: " + sommePositif);
            System.out.println("Somme négative: " + sommeNegatif);
        }

    }
}
