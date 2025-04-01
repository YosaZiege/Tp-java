public class Main {
  public static void main(String[] args) {

    Adherent adh = new Adherent("adh1",
        "preAdh1",
        "adh1@gmail.com",
        "063029320",
        20,
        1);

    Auteur aut = new Auteur("aut1",
        "prenAut1",
        "aut1@gmail.com",
        "06090454",
        45,
        1);

    Livre lvr = new Livre(12, "La boite", aut);
    System.out.println("Information sur Le Livre");
    System.out.println(lvr.toString());
    System.out.println("Information sur L'Adherent");
    System.out.println(adh.toString());
  }
}
