public class TestMachine {
    public static void main(String[] args) {
        MachineProduction.setMaxProducts(100); 

        MachineProduction machine1 = new MachineProduction();
        MachineProduction machine2 = new MachineProduction();

        machine1.produce(30);
        machine2.produce(50);
        machine1.produce(40); 

        System.out.println("Total Products: " + MachineProduction.getTotalProducts());
    }
}
