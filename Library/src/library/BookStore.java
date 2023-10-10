package library;

import java.util.List;

public class BookStore {

    public BookStore() {

    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    //a bookstore has books
    private List<Book> books;


    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("""
                        %d darab könyv van összese, amiből %d kölcsönözhető.\r
                        %d darab %s van, amiből %d kölcsönözhető.\r
                        %d darab %s van, amiből %d kölcsönözhető.\r
                        %d darab %s van, amiből %d kölcsönözhető.
                        """, getAllBooks(), getRentableBooks(),
                getBooks(Genre.HORROR), Genre.HORROR, getRentableBooks(Genre.HORROR),
                getBooks(Genre.ADVENTURE), Genre.ADVENTURE, getRentableBooks(Genre.ADVENTURE),
                getBooks(Genre.ROMANTIC), Genre.ROMANTIC, getRentableBooks(Genre.ROMANTIC));
    }

    private int getAllBooks() {
        return books.size();
    }

    private int getRentableBooks() {
        int counter = 0;
        for (Book book : books) {
            if (book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }

    private int getBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre) {
                counter++;
            }
        }
        return counter;
    }

    private int getRentableBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre && book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }
}
