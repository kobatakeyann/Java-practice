package basis.chapter_14.points.oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // private constant attribute
    private final List<Book> BOOKS;

    // コンストラクタ
    public Library() {
        this.BOOKS = new ArrayList<>();
    };

    public void addBook(Book book) {
        this.BOOKS.add(book);
    }

    public void displayLibrary() {
        for (Book book : this.BOOKS) {
            book.showAttributes();
        }
    }
}
