package chapter1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        // 練習問題
        BookShelf2 bookShelf2 = new BookShelf2();
        bookShelf2.appendBook(new Book("Around the World in 80 Days"));
        bookShelf2.appendBook(new Book("Bible"));
        bookShelf2.appendBook(new Book("Cinderella"));
        bookShelf2.appendBook(new Book("Daddy-Long-Legs"));

        Iterator<Book> it2 = bookShelf2.iterator();
        while (it2.hasNext()) {
            Book book = it2.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for (Book book : bookShelf2) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
