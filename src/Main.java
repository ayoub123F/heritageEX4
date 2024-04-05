public class Main {
    public static void main(String[] args) {
        // Création d'un ingénieur
        Ingenieur ingenieur = new Ingenieur("Dupont", "Jean", "jean.dupont@email.com", "123456789", 3000, "Développement");

        // Création d'un manager
        Manager manager = new Manager("Martin", "Paul", "paul.martin@email.com", "987654321", 5000, "Ressources humaines");

        // Affichage des informations de l'ingénieur
        System.out.println("Informations de l'ingénieur :");
        System.out.println("Nom : " + ingenieur.getNom());
        System.out.println("Prénom : " + ingenieur.getPrenom());
        System.out.println("Salaire : " + ingenieur.calculerSalaire());
        System.out.println("Spécialité : " + ingenieur.getSpecialite());

        // Affichage des informations du manager
        System.out.println("\nInformations du manager :");
        System.out.println("Nom : " + manager.getNom());
        System.out.println("Prénom : " + manager.getPrenom());
        System.out.println("Salaire : " + manager.calculerSalaire());
        System.out.println("Service : " + manager.getService());
    }
}
