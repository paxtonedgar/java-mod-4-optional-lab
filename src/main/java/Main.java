import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        Optional<String> optAuthor = Book.getAuthor(bookName);

        optAuthor.ifPresentOrElse((authorName) -> System.out.println(bookName + " written by: "+ authorName),() -> System.out.println("Unknown"));
        //if author is not null, print
        // write your code here
    }
}

// DO NOT MODIFY the code below //
class Book {
    private static final Map<String, String> books = new HashMap<>();

    static {
        books.put("Effective Java", "Joshua Bloch");
        books.put("Designing Data-Intensive Applications", "Martin Kleppmann");
        books.put("Modern Java in Action", "Raoul-Gabriel Urma");
    }

    static Optional<String> getAuthor(String name) {
        return Optional.ofNullable(books.get(name));
    }
}
