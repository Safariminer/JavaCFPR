package althotth.at04;

public class At04Ex02 {
    public static void main(String[] args) {

        int[][] tableau = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(tableau[y][x] + " ");
            }
            System.out.println();
        }

    }
}
