package althotth.tp3;

public class Livre {
    enum Categorie{
        CATEGORIE_INCONNU,
        CATEGORIE_FICTION,
        CATEGORIE_SCIENCE,
        CATEGORIE_BIOGRAPHIE
    }
    
    
    public String titre, auteur;
    Categorie categorie;
    short anneePublication;
    boolean disponible = true;
}
