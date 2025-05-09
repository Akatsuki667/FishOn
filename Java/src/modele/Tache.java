package src.modele;

public class Tache {
    // Variable d'instance/Attribut privé
    private String titre;
    private String description;
    private int categorie;
    private boolean termine;

    // Constructeur paramétré
    public Tache(String titre, String description, int categorie, boolean termine) {
        this.titre = titre;
        this.description = description;
        this.categorie = categorie;
        this.termine = false;
    }

    // Getter
    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getCategorie() {
        return categorie;
    }

    public boolean isTermine() {
        return termine;
    }

    // Setter
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategorie(int categorie) {
        if (categorie >= 1 && categorie <= 3) {
            this.categorie = categorie;
        } else {
            System.out.println("Error, seulement catégorie 1, 2, 3");
        }
    }

    // Méthode d'instance tache terminé
    public void tacheTermine() {
        this.termine = true;
    }
    
    // Méthode d'instance rénitialisation état tache
    public void tacheNonTermine() {
        this.termine = false;
    }

    // Méthode d'instance information tache
    public String toString() {
        return "Tâche: " + titre + " (" + categorie + ")" +
               "\nDescription: " + description +
               "\nStatut: " + (terminee ? "Terminée" : "En cours");
    }
}
