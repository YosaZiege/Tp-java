public class Main {
  public static void main(String[] args) {
    Voiture voiture1 = new Voiture("voit1", 20000, "20BC", 2020);
    Moto moto1 = new Moto("moto1", 5000, "ACB", 20);
    Avion avion1 = new Avion("av1", 5000000, "Imarate", 200);

    voiture1.afficherInformations();
    moto1.afficherInformations();
    avion1.afficherInformations();

    voiture1.emettreSon();
    moto1.emettreSon();
    avion1.emettreSon();
  }
}
