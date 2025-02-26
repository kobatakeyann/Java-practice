package chapter_14.exercise;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> BOOKS;

    public Library() {
        this.BOOKS = new ArrayList<>();
    }

    public void add(Book book) {
        this.BOOKS.add(book);
    }

    public void findAndShow(String searchWord) {
        System.out.printf("「%s」で検索します…\n", searchWord);
        for (Book book : this.BOOKS) {
            if (book.getTitle().contains(searchWord)) {
                book.buildDisplayLine();
                return;
            }
        }
        System.out.printf("\"%s\"に該当する書籍は見つかりませんでした\n", searchWord);
    }

    public void displayAll() {
        for (Book book : this.BOOKS) {
            book.buildDisplayLine();
        }
    }
}
