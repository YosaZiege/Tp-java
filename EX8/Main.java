
public class Main {
  public static void main(String[] args) {
    CarteCredit carteCredit = new CarteCredit(0, "CC-001", "1234-5678-9012-3456", "12/25", "123");
    PayPal paypal = new PayPal(0, "PP-001", "utilisateur@exemple.com");

    Commande commande1 = new Commande("CMD-001", 199.99, carteCredit);
    Commande commande2 = new Commande("CMD-002", 59.99, paypal);

    System.out.println("=== Traitement de la commande 1 ===");
    commande1.processPayment();

    System.out.println("\n=== Traitement de la commande 2 ===");
    commande2.processPayment();
  }
}
