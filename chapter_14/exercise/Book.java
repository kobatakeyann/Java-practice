package chapter_14.exercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book {
    private String title, author;
    private BigDecimal price;
    private int page;

    public Book(String title, String author, BigDecimal price, int page) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.page = page;
    }

    public void buildDisplayLine() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        String outputFormat = "タイトル: 『%s』, 著者名: %s, 価格: %s円, ページ数: %dp\n";
        System.out.printf(outputFormat, this.title, this.author, decimalFormat.format(this.price),
                this.page);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
