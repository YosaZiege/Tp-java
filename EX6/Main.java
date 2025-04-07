public class Main {
  public static void main(String[] args) {
    Cercle cercle = new Cercle("Mon cercle", 5.0);
    Rectangle rectangle = new Rectangle("Mon rectangle", 4.0, 6.0);
    Triangle triangle = new Triangle("Mon triangle", 3.0, 4.0, 5.0);

    System.out.println("=== Détails du cercle ===");
    cercle.afficherDetails();

    System.out.println("\n=== Détails du rectangle ===");
    rectangle.afficherDetails();

    System.out.println("\n=== Détails du triangle ===");
    triangle.afficherDetails();
  }
}
