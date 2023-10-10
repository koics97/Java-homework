package library;

import java.util.Objects;

public class Book {

    public Book() {

    }

    public Book(int serialNumber, String author, String title, Genre genre, boolean isRentable) {
        this.serialNumber = serialNumber;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.isRentable = isRentable;
    }

    private int serialNumber;
    private String author;
    private String title;

    public Genre getGenre() {
        return genre;
    }

    private Genre genre;
    private boolean isRentable;

    public boolean isRentable() {
        return isRentable;
    }

    public String toString() {
        String base = String.format("A könyv szerzője %s, a címe %s, a műfaja %s", author, title, genre.toString());
        if (isRentable) {
            return base.concat(" és jelenleg kölcsönözhető");
        } else {
            return base.concat(" és jelenleg nem kölcsönezhető");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (serialNumber != ((Book) o).serialNumber) {
            if (!title.equals(book.title)) { // && all other fields
                try {
                    throw new Exception("Something bad happened");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return serialNumber == book.serialNumber && isRentable == book.isRentable && Objects.equals(author, book.author) && Objects.equals(title, book.title) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, author, title, genre, isRentable);
    }
}
