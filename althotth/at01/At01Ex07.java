package althotth.at01;

public class At01Ex07 {
    public static void main(String[] args) {
        float a = 2, b = 3, c = 5, d = 3;

        
        System.out.println((3 * 10 + 45 / 5 - 8 + 56 % 20));
        System.out.println((3 * 10 + 45 / 5 - (8 + 56) % 20));
        System.out.println((3 * 10 + 45 / (5 - 8 + 56) % 20));
        System.out.println((3 * 10 + 45 / (5 - 8) + 56 % 20));
        System.out.println((3 * (10 + 45) / 5 - 8 + 56 % 20));
        System.out.println((3 * (10 + 45 / 5) - 8 + 56 % 20));
        System.out.println("-------------");
        System.out.println(12 + 3 * 4 / 3);
        System.out.println(3.7 + (8 / 2)*(8 / 2));
        System.out.println(13 + 4 * 2 - 3 * (8 % 3 + 5));
        System.out.println(6 / 2 / 3);
        System.out.println(-(5 * 2)*(5 * 2)* 10 + 18 / (4 + 8 / 2 / 2));
        System.out.println(24 + 36 / (6 * 3 / (7 + 2 )));
        System.out.println(8 + 4 / 2 + 6);
        System.out.println((int)(7.67 + 0.5) - (int)7.67);
        System.out.println((int)(-7.67 + 0.5) - (int)(-7.67));
        System.out.println(3 + 5 * 6 / 3 - 5);

        System.out.println(1.0/(1.0/2));
        System.out.println(1.0/1.0/2.0);

        System.out.println("-------------");

        System.out.println((a*(b+d)-2)*3);
        System.out.println(Math.sqrt(c-a)*d-1);
        System.out.println(b*(-d+2)-a*(c+d));
        
    }
}
