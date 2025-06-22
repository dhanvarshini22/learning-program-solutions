public class Main {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                .build();

        // Gaming configuration
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        System.out.println("=== Basic Computer ===");
        basicComputer.showConfig();

        System.out.println("\n=== Gaming Computer ===");
        gamingComputer.showConfig();
    }
}
