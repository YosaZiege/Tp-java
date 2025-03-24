public class Compte {
    private double solde;
    private String numero;
    private static int nbComptes = 0;

    public Compte(String numero) {
        this.solde = 0;
        this.numero = numero;
        nbComptes++;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void deposit(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }

    public void withdraw(double montant) {
        if (montant > solde) {
            System.out.println("Retrait refusé : solde insuffisant.");
        } else {
            solde -= montant;
        }
    }

    public void display() {
        System.out.println("Compte N°" + numero + " | Solde: " + solde + " MAD");
    }

    public static void displayNbComptes() {
        System.out.println("Nombre total de comptes créés : " + nbComptes);
    }

    public static void main(String[] args) {
        Compte c1 = new Compte("C001");
        Compte c2 = new Compte("C002");
        Compte c3 = new Compte("C003");

        displayNbComptes();

        c1.deposit(1000);
        c2.deposit(2000);
        c3.deposit(3000);

        c1.display();
        c2.display();
        c3.display();

        c1.withdraw(500);
        c2.withdraw(2500);
        c3.withdraw(500);

        c1.display();
        c2.display();
        c3.display();
    }
}
