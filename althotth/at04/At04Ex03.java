package althotth.at04;

public class At04Ex03 {
    public static void main(String[] args) {
        int[][] tableau = {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
        };

        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(tableau[y][x] + " ");
            }
            System.out.println();
        }
    }
}
