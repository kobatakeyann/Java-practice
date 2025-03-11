package basis.chapter_14.points.oop;

import java.math.BigDecimal;

public class Book {
    // attributeの宣言
    String title, author;
    BigDecimal price;
    int page;

    // コンストラクタ
    public Book(String title, String author, BigDecimal price, int page) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.page = page;
    }

    // コンストラクタのオーバーロード(デフォルト値つき)
    public Book(String title, BigDecimal price, int page) {
        this(title, "unknown", price, page); // 別のコンストラクタの利用
    }

    public void showAttributes() {
        String outputFormat = "title: %s, author: %s, price: %s円, page: %dページ\n";
        System.out.printf(outputFormat, this.title, this.author, this.price, this.page);
    }
}
