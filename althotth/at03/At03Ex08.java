package althotth.at03;

public class At03Ex08 {
    
    static float moyEval(Object[][] tableau, int eval){
        float somme = 0, moyenne;

        for(int i = 1; i <= 8; i++){
            somme += (int)tableau[i][eval];
        }

        moyenne = somme / 8;
        return moyenne;
    }

    static float moyEtu(Object[][] tableau, int etu){
        float somme = 0, moyenne;

        for(int i = 1; i <= 3; i++){
            somme += (int)tableau[etu][i];
        }

        moyenne = somme / 3;
        return moyenne;
    }

    public static void main(String[] args) {
        Object[][] tableauNotes =
        {
            { "Étudiants", "TP1", "TP2", "Examen1" },
            { "Pierre",      65,    45,        34  },
            { "André",       78,    55,        65  },
            { "Julie",       43,    67,        21  },
            { "Brigitte",    82,    89,        67  },
            { "Anne",        76,   100,        75  },
            { "Olivier",     91,    95,        54  },
            { "Simon",       71,    92,        69  },
            { "Nadine",      96,    81,        54  },
        };


        System.out.println("Moyenne TP1    : " + moyEval(tableauNotes, 1));
        System.out.println("Moyenne TP2    : " + moyEval(tableauNotes, 2));
        System.out.println("Moyenne Examen : " + moyEval(tableauNotes, 3));
        System.out.println("----------------------------------------");

        System.out.println("Moyenne Pierre   : " + moyEtu(tableauNotes, 1));
        System.out.println("Moyenne André    : " + moyEtu(tableauNotes, 2));
        System.out.println("Moyenne Julie    : " + moyEtu(tableauNotes, 3));
        System.out.println("Moyenne Brigitte : " + moyEtu(tableauNotes, 4));
        System.out.println("Moyenne Anne     : " + moyEtu(tableauNotes, 5));
        System.out.println("Moyenne Olivier  : " + moyEtu(tableauNotes, 6));
        System.out.println("Moyenne Simon    : " + moyEtu(tableauNotes, 7));
        System.out.println("Moyenne Nadine   : " + moyEtu(tableauNotes, 8));

    }
}
