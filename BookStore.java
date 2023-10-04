import java.util.ArrayList;

import java.util.List;

public class BookStore {
    public BookStore(){
        inventory = new ArrayList<>();

    }
    public void addBook(Book book) {
        inventory.add(book);

    }
    public void removeBook(String isbn) {
        inventory.removeIf(book -> book.getIsbn().equals(isbn));

    }



    public static void main(String[] args) {


    }
}
