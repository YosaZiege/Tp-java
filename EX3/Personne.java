// 4 - Creation de la classe Personne et redefinition de toString
public class Personne {
  private String nom;
  private String prenom;
  private String email;
  private String tel;
  private int age;

  public Personne(String nom, String prenom, String email, String tel, int age) {
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.tel = tel;
    this.age = age;
  }

  public String toString() {
    return " nom :" + this.nom +
        " prenom :" + this.prenom +
        " email :" + this.email +
        " tel :" + this.tel +
        " age :" + this.age;
  }

  public String getNom() {
    return this.nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public String getEmail() {
    return this.email;
  }

  public String getTel() {
    return this.tel;
  }

  public int getAge() {
    return this.age;
  }
}
