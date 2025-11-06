package althotth.at03;

public class At03Ex03 {
    public static void main(String[] args) {

        java.util.Scanner entree = new java.util.Scanner(System.in);
        System.out.print("Combien de nombres? >>> ");
        int nombreNombres = entree.nextInt();
        int[] nombresAleatoires = new int[nombreNombres];
        int[] nombresAleatoiresInverse = new int[nombreNombres];
        entree.close();
        for(int i = 0; i < nombreNombres; i++) nombresAleatoires[i] = (int)(Math.random() * 100);

        System.arraycopy(nombresAleatoires, 0, nombresAleatoiresInverse, 0, nombreNombres);
        
        for(int i = 0; i < nombreNombres/2; i++){
            int n = nombresAleatoiresInverse[i];
            nombresAleatoiresInverse[i] = nombresAleatoiresInverse[(nombreNombres-1)-i];
            nombresAleatoiresInverse[(nombreNombres-1)-i] = n;
        }

        for(int n : nombresAleatoires){
            System.out.print(n + ";");
        }

        System.out.println();

        for(int n : nombresAleatoiresInverse){
            System.out.print(n + ";");
        }
        

    }
}
