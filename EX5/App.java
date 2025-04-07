
public class App {
  public static void main(String[] args) {

    Ingenieur ingenieur = new Ingenieur("Dupont", "Jean", "jean.dupont@entreprise.com", "0123456789", 3000,
        "Développement Web");

    Manager manager = new Manager("Martin", "Sophie", "sophie.martin@entreprise.com", "0987654321", 4000,
        "Développement logiciel");

    System.out.println("=== Informations de l'ingénieur ===");
    System.out.println("Nom: " + ingenieur.nom);
    System.out.println("Prénom: " + ingenieur.prenom);
    System.out.println("Salaire de base: " + ingenieur.salaire + " €");
    System.out.println("Salaire calculé: " + ingenieur.calculerSalaire() + " €");
    System.out.println("Spécialité: " + ingenieur.getSpecialite());

    System.out.println("\n=== Informations du manager ===");
    System.out.println("Nom: " + manager.nom);
    System.out.println("Prénom: " + manager.prenom);
    System.out.println("Salaire de base: " + manager.salaire + " €");
    System.out.println("Salaire calculé: " + manager.calculerSalaire() + " €");
    System.out.println("Service: " + manager.getService());
  }
}
