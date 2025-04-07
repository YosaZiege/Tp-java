
public class Triangle extends Figure {
  private double coteA;
  private double coteB;
  private double coteC;

  public Triangle(String nom, double coteA, double coteB, double coteC) {
    super(nom);
    this.coteA = coteA;
    this.coteB = coteB;
    this.coteC = coteC;
  }

  @Override
  public double calculerAire() {
    double p = (coteA + coteB + coteC) / 2;
    return Math.sqrt(p * (p - coteA) * (p - coteB) * (p - coteC));
  }

  @Override
  public double calculerPerimetre() {
    return coteA + coteB + coteC;
  }
}
