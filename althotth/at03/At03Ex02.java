package althotth.at03;

public class At03Ex02 {
    public static void main(String[] args) {
        float[] tableau = new float[10];
        java.util.Scanner entree = new java.util.Scanner(System.in);
        for(int i = 0; i < 10; i++){
            tableau[i] = entree.nextFloat();
        }

        for(float f : tableau){
            System.out.println(f);
        }
        entree.close();
    }
}
