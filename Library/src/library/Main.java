package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            books.add(new Book(i + 1, "William Shakespeare", "Romeo and Juliet", Genre.ROMANTIC, true));
        }

        for (int i = 31; i <= 80; i++) {
            books.add(new Book(i, "Edgar Allan Poe", "The Raven", Genre.HORROR, false));
        }

        for (int i = 81; i <= 100; i++) {
            books.add(new Book(i, "Jules Verne", "Around the World in Eighty Days", Genre.ADVENTURE, isRentable()));
        }

        BookStore bookStore = new BookStore(books);
        System.out.println(bookStore);

        System.out.println(books.get(28));
    }

    static boolean isRentable() {
        Random random = new Random();
        int randomNumber = random.nextInt(10 - 1) + 1;
        return randomNumber % 2 == 0;
    }
}
