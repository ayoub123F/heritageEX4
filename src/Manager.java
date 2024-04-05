public class Manager extends Employe {
    private String service;

    // Constructeur avec paramètres
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    // Redéfinition de la méthode pour calculer le salaire
    @Override
    public double calculerSalaire() {
        // Augmentation de 20% par rapport au salaire normal
        return getSalaire() * 1.20;
    }

    // Getter pour service
    public String getService() {
        return service;
    }
}

