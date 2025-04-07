public abstract class Employee {
  protected String nom;
  protected String prenom;
  protected String email;
  protected String telephone;
  protected double salaire;

  public Employee(String nom, String prenom, String email, String telephone, double salaire) {
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.telephone = telephone;
    this.salaire = salaire;
  }

  public Employee() {
    this.nom = "";
    this.prenom = "";
    this.email = "";
    this.telephone = "";
    this.salaire = 0.0;
  }

  public abstract double calculerSalaire();
}
