public class Commande {
  private String reference;
  private double montant;
  private Paiement moyenPaiement;

  public Commande(String reference, double montant, Paiement moyenPaiement) {
    this.reference = reference;
    this.montant = montant;
    this.moyenPaiement = moyenPaiement;
  }

  public boolean processPayment() {
    System.out.println("Traitement du paiement pour la commande " + reference);
    return moyenPaiement.effectuerPaiement(montant);
  }
}
