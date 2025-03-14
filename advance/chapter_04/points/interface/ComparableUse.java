import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUse {
    public static void main(String[] args) {
        List<Book> bookHolder = new ArrayList<>();
        bookHolder.add(new Book("candy", 45));
        bookHolder.add(new Book("adventure", 98));
        bookHolder.add(new Book("journey", 50));
        bookHolder.add(new Book("violence", 32));
        System.out.println(bookHolder.toString());
        // 定義した自然順序でソート
        Collections.sort(bookHolder);
        System.out.println(bookHolder.toString());
    }
}


record Book(String title, int page) implements Comparable<Book> {
    // compareToメソッドをオーバーライドして、自然順序をクラス内で定義
    @Override
    public int compareTo(Book that) {
        return this.title.compareTo(that.title);
    }
}
