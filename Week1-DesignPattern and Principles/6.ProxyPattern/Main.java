public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // First time loading
        System.out.println("\n--- First display ---");
        image1.display(); // will load from remote
        image2.display(); // will load from remote

        // Second time (should use cache)
        System.out.println("\n--- Second display ---");
        image1.display(); // should use cache
        image2.display(); // should use cache
    }
}
