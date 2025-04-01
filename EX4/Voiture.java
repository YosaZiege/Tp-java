
public class Voiture extends Vehicule {
  private String modele;
  private int annee;

  public Voiture(String nom, double prix, String modele, int annee) {
    super(nom, prix);
    this.modele = modele;
    this.annee = annee;
  }

  @Override
  public void emettreSon() {
    System.out.println("Le voiture vrombit.");
  }

  @Override
  public void afficherInformations() {
    System.out.println("Le modele : " + this.modele +
        " L'annee : " + this.annee);
  }

}
