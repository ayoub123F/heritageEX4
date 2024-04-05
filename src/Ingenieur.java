public class Ingenieur extends Employe {
    private String specialite;

    // Constructeur avec paramètres
    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    // Redéfinition de la méthode pour calculer le salaire
    @Override
    public double calculerSalaire() {
        // Augmentation de 15% par rapport au salaire normal
        return getSalaire() * 1.15;
    }

    // Getter pour specialite
    public String getSpecialite() {
        return specialite;
    }
}
