package althotth.at03;

public class At03Ex04 {
    public static void main(String[] args) {
        int[] tableau = new int[5];
        for(int i = 0; i < 5; i++) tableau[i] = (int)(Math.random()*100);


        // where A = index, B = valeur
        Tuple<Integer,Integer> plusPetit = new Tuple<Integer,Integer>();
        Tuple<Integer,Integer> plusGrand = new Tuple<Integer,Integer>(); 

        plusPetit.b = 100;
        plusGrand.b = 0;

        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] < plusPetit.b){
                plusPetit.b = tableau[i];
                plusPetit.a = i;
            }
            if(tableau[i] > plusGrand.b){
                plusGrand.b = tableau[i];
                plusGrand.a = i;
            }
        }

        System.out.print("Tableau: ");
        for(int n : tableau) System.out.print(n + ";");
        System.out.println();

        System.out.println("Plus petit: " + plusPetit.b + " à l'index " + plusPetit.a);
        System.out.println("Plus grand: " + plusGrand.b + " à l'index " + plusGrand.a);

    }
}
