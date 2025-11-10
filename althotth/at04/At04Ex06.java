package althotth.at04;

public class At04Ex06 {
    static boolean nombreDonneCarre(int nombre){
        return (float)(int)Math.sqrt((float)nombre) == (float)Math.sqrt((float)nombre);
    }
    
    public static void main(String[] args) {
        java.util.Scanner entree = new java.util.Scanner(System.in);

        int nombre = 0, essais = 0;
        do{
            if(essais > 0) System.out.println("Ce nombre ne peut pas faire de carré");
            System.out.print("Combien de cases voulez-vous? >>> ");
            nombre = entree.nextInt();
            essais++;
        } while(!nombreDonneCarre(nombre));

        int resolution = (int)Math.sqrt(nombre);
        int[][] tableau = new int[resolution][resolution];
        
        for(int y = 0; y < resolution - 1; y++){
            for(int x = 0; x < resolution - 1; x++){
                tableau[y][x] = (int)(Math.random() * 100);
            }
        }

        for(int y = 0; y < resolution; y++){
            for(int x = 0; x < resolution; x++){
                System.out.print(tableau[y][x] + " ");
            }
            System.out.println();
        }

        entree.close();
    }
}
