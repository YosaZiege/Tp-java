// 3 - Creation de la classe Auteur et redefinition de toString

public class Auteur extends Personne {
  private int numAuteur;

  public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
    super(nom, prenom, email, tel, age);
    this.numAuteur = numAuteur;
  }

  public int getNumAutheur() {
    return this.numAuteur;
  }

  @Override
  public String toString() {
    return " numero Auteur :" + numAuteur +
        " nom :" + getNom() +
        " prenom :" + getPrenom() +
        " email :" + getEmail() +
        " tel :" + getTel() +
        " age :" + getAge();

  }
}
