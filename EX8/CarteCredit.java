public class CarteCredit extends Paiement {
  private String numeroCarte;
  private String dateExpiration;
  private String codeSecurite;

  public CarteCredit(double montant, String numeroTransaction, String numeroCarte,
      String dateExpiration, String codeSecurite) {
    super(montant, numeroTransaction);
    this.numeroCarte = numeroCarte;
    this.dateExpiration = dateExpiration;
    this.codeSecurite = codeSecurite;
  }

  @Override
  public boolean effectuerPaiement(double montant) {
    System.out.println("Paiement par carte de crédit en cours...");
    System.out.println("Numéro de carte: " + masquerNumeroCarte());
    System.out.println("Montant: " + montant + " €");
    System.out.println("Transaction " + numeroTransaction + " effectuée avec succès!");
    return true;
  }

  private String masquerNumeroCarte() {
    if (numeroCarte.length() < 4) {
      return numeroCarte;
    }
    return "XXXX-XXXX-XXXX-" + numeroCarte.substring(numeroCarte.length() - 4);
  }
}
