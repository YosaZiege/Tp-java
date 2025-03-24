public class MachineProduction {
	private int id;
	private int nbProducts;
	private static int nbMachines = 0;
	private static int totalProducts = 0;
	private static int maxProducts = 0;

	public MachineProduction() {
		this.id = ++nbMachines;
		this.nbProducts = 0;
	}

	public boolean produce(int quantity) {
		if (quantity <= 0) {
			System.out.println("Quantité invalide.");
			return false;
		}
		if (totalProducts + quantity > maxProducts) {
			System.out.println("Production impossible : capacité maximale atteinte.");
			return false;
		}
		nbProducts += quantity;
		totalProducts += quantity;
		return true;
	}

	public int getId() {
		return id;
	}

	public int getNbProducts() {
		return nbProducts;
	}

	public static int getNbMachines() {
		return nbMachines;
	}

	public static int getTotalProducts() {
		return totalProducts;
	}

	public static int getMaxProducts() {
		return maxProducts;
	}

	public static void setMaxProducts(int max) {
		if (max >= 0) {
			maxProducts = max;
		} else {
			System.out.println("Valeur invalide pour maxProducts.");
		}
	}
}
