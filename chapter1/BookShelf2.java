package chapter1;

import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf2 implements Iterable<Book> {
    private ArrayList<Book> books;

    public BookShelf2() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return this.books.iterator();
    }
}
