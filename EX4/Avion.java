
public class Avion extends Vehicule {
  private String compagnie;
  private double vitesseMax;

  public Avion(String nom, double prix, String compagnie, double vitesseMax) {
    super(nom, prix);
    this.compagnie = compagnie;
    this.vitesseMax = vitesseMax;
  }

  @Override
  public void emettreSon() {
    System.out.println("L'avion fait un bruit de moteur puissant.");
  }

  @Override
  public void afficherInformations() {
    System.out.println("La compagnie : " + this.compagnie +
        " La vitesse Max : " + this.vitesseMax);
  }
}
