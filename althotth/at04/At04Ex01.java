package althotth.at04;

public class At04Ex01 {

    static int[] ordre(int[] tableau){
        int[] tableauOrdre = tableau;


        boolean enOrdre = false;
        while(!enOrdre){
            int swaps = 0;

            for(int i = 0; i < tableauOrdre.length - 1; i++){
                if(tableau[i] > tableau[i+1]){
                    int temp = tableau[i+1];
                    tableau[i+1] = tableau[i];
                    tableau[i] = temp;
                    swaps++;
                }
            }

            enOrdre = swaps == 0;
        }


        return tableauOrdre;
    }

    public static void main(String[] args) {
        int[] tableau = {
            100,
            2,
            43,
            543,
            -45,
            659,
            32,
            9,
            9,
            348,
            12
        };
        for(int n : tableau){
            System.out.print(n + ";");
        }
        System.out.println("\n---------------------");
        int[] tableauEnOrdre = ordre(tableau);

        for(int n : tableauEnOrdre){
            System.out.print(n + ";");
        }
    }
}
