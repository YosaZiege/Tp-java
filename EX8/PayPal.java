public class PayPal extends Paiement {
  private String email;

  public PayPal(double montant, String numeroTransaction, String email) {
    super(montant, numeroTransaction);
    this.email = email;
  }

  @Override
  public boolean effectuerPaiement(double montant) {
    System.out.println("Paiement par PayPal en cours...");
    System.out.println("Email: " + email);
    System.out.println("Montant: " + montant + " €");
    System.out.println("Transaction " + numeroTransaction + " effectuée avec succès!");
    return true;
  }
}
