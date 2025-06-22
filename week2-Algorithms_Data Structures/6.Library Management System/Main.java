public class Main {
    public static void main(String[] args) {
        Library lib = new Library(10);

        // Add sample books
        lib.addBook(new Book(101, "Clean Code", "Robert Martin"));
        lib.addBook(new Book(102, "The Pragmatic Programmer", "Andy Hunt"));
        lib.addBook(new Book(103, "Introduction to Algorithms", "Cormen"));
        lib.addBook(new Book(104, "Effective Java", "Joshua Bloch"));

        // List books
        System.out.println("📚 Library Collection:");
        lib.listBooks();

        // Linear search
        System.out.println("\n🔍 Linear Search for 'Effective Java':");
        Book result1 = lib.linearSearchByTitle("Effective Java");
        System.out.println(result1 != null ? result1 : "Not found");

        // Binary search
        System.out.println("\n⚡ Binary Search for 'Clean Code':");
        Book result2 = lib.binarySearchByTitle("Clean Code");
        System.out.println(result2 != null ? result2 : "Not found");
    }
}
