package chapter_14.points.oop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Bookクラスのインスタンス生成
        Book book1 = new Book("swan story", "T.Bird", BigDecimal.valueOf(2000), 100);
        Book book2 = new Book("adventure", BigDecimal.valueOf(1500), 79);
        // Libraryクラスのインスタンス生成
        Library library = new Library();
        // Bookインスタンスを追加
        library.addBook(book1);
        library.addBook(book2);
        // Libraryクラスのインスタンスメソッドの呼び出し
        library.displayLibrary();
    }
}
