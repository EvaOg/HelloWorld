package library;

public class LibraryApp {
    private BookRepository bookRepositiry = new BookRepository();

    public void searchByIsbn(String isbn) {
        Book x = bookRepositiry.findByIsbn(isbn);
        if (x != null) {
            System.out.print("1 book found:" +  x.getTitle());
        }
        else {
            System.out.println("Book not found");
        }
    }
}
