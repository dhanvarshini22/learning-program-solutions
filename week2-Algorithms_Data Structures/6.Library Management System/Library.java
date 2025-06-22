import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        } else {
            System.out.println("Library full.");
        }
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search by Title (must be sorted)
    public Book binarySearchByTitle(String title) {
        // Sort before binary search
        Arrays.sort(books, 0, count, Comparator.comparing(b -> b.title));

        int low = 0, high = count - 1;
        title = title.toLowerCase();
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareTo(title);
            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
