
public class Main {
  public static void main(String[] args) {
    Livre livre1 = new Livre("1984", "George Orwell");
    Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");

    DVD dvd1 = new DVD("Inception", "Christopher Nolan");
    DVD dvd2 = new DVD("Le Seigneur des Anneaux", "Peter Jackson");

    Utilisateur utilisateur1 = new Utilisateur("Alice");
    Utilisateur utilisateur2 = new Utilisateur("Bob");

    System.out.println("=== Tests d'emprunt ===");
    utilisateur1.emprunterObjet(livre1);
    utilisateur2.emprunterObjet(livre1);
    utilisateur2.emprunterObjet(livre2);
    utilisateur1.emprunterObjet(dvd1);
    utilisateur2.emprunterObjet(dvd2);

    System.out.println("\n=== Tests de retour ===");
    livre1.retourner();
    dvd1.retourner();
    livre1.retourner();

    System.out.println("\n=== Nouveaux emprunts après retour ===");
    utilisateur2.emprunterObjet(livre1);
    utilisateur1.emprunterObjet(dvd1);
  }
}
