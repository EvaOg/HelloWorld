package library;

import java.util.ArrayList;

public class BookRepository {
        private ArrayList<Book> books = new ArrayList<Book>();

        //constructor. According to the "Book" schema we create an array of books-objects
        public BookRepository() {
            books.add(new Book("1111", "The Dead of Night", "Horror", null, "S. Eleton"));
            books.add(new Book("1222", "Castles", "Historical", null, "S. Anderson"));
            books.add(new Book("1333", "The knight", "Fantasy", null, "S. Anvil"));
        }

        //method/function It takes method "Book" because it returns a book or null
        public Book findByIsbn(String isbn) {
            //for Array "Book" look for a "x" in array named "books"
            for (Book x : books) {
                if (x.getIsbn().equals(isbn)) {
                    return x;
                }
            }
            return null;
        }
}
