// 4 - Creation de la classe Livre (ISBN, titre , Auteur) et redefinition de toString

public class Livre {
  private int ISBN;
  private String titre;
  private Auteur auteur;

  public Livre(int ISBN, String titre, Auteur auteur) {
    this.ISBN = ISBN;
    this.titre = titre;
    this.auteur = auteur;
  }

  @Override
  public String toString() {
    return " ISBN :" + this.ISBN +
        " titre :" + this.titre +
        auteur.toString();
  }
}
