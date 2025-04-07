public class Livre implements Empruntable {
  private String titre;
  private String auteur;
  private boolean estEmprunte;

  public Livre(String titre, String auteur) {
    this.titre = titre;
    this.auteur = auteur;
    this.estEmprunte = false;
  }

  @Override
  public void emprunter() {
    if (!estEmprunte) {
      estEmprunte = true;
      System.out.println("Le livre \"" + titre + "\" de " + auteur + " a été emprunté.");
    } else {
      System.out.println("Le livre \"" + titre + "\" est déjà emprunté.");
    }
  }

  @Override
  public void retourner() {
    if (estEmprunte) {
      estEmprunte = false;
      System.out.println("Le livre \"" + titre + "\" de " + auteur + " a été retourné.");
    } else {
      System.out.println("Le livre \"" + titre + "\" n'est pas emprunté.");
    }
  }

  public String getTitre() {
    return titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public boolean estEmprunte() {
    return estEmprunte;
  }
}
