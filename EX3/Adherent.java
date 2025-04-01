// 2 - Creation de la classe Adherent et redefinition de toString
public class Adherent extends Personne {
  private int numAdherent;

  public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
    super(nom, prenom, email, tel, age);
    this.numAdherent = numAdherent;
  }

  @Override
  public String toString() {
    return " numero Adherent :" + numAdherent +
        " nom :" + getNom() +
        " prenom :" + getPrenom() +
        " email :" + getEmail() +
        " tel :" + getTel() +
        " age :" + getAge();

  }
}
