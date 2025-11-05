package althotth.test;


import commun.*;

import java.awt.Color;
import java.lang.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> yessirMillers = new ArrayList<String>();
        yessirMillers.add("yessir miller");
        yessirMillers.add("Yessir Miller");
        yessirMillers.add("Yessir, miller!");
        yessirMillers.add("yessir miller!!1!1!!1!!!1!!!1!!!!!");


        int width = 640, height = 480;
        FenetreDessin fenetreDessin = new FenetreDessin("j'aime ben louis valois", width, height);
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                fenetreDessin.couleurCrayon(new Color(x % 256, y % 256, (int)((float)x / (float)width * 255.0f)));
                fenetreDessin.dessinePoint(x, y);
            }
        }
        

        for(int i = 0; i < 10000000; i++){

            int x = (int)(Math.random() * width);
            int y = (int)(Math.random() * height);
            int ym = (int)(Math.random() * yessirMillers.size());
            
            fenetreDessin.couleurCrayon(new Color(0));
            fenetreDessin.dessineTexte(x+2, y+2, yessirMillers.get(ym));
            fenetreDessin.couleurCrayon(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
            fenetreDessin.dessineTexte(x, y, yessirMillers.get(ym));
            try {
                java.lang.Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
