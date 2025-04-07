public class Utilisateur {
  private String nom;

  public Utilisateur(String nom) {
    this.nom = nom;
  }

  public void emprunterObjet(Empruntable objet) {
    System.out.println(nom + " souhaite emprunter un objet:");
    objet.emprunter();
  }

  public String getNom() {
    return nom;
  }
}
