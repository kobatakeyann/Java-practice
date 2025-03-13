package advance.chapter_01.exercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

public class Book extends Publication {
    private String author;

    public Book(String title, String author, BigDecimal price, int page, State state) {
        super(title, price, page, state);
        if (author == null) {
            throw new IllegalArgumentException("Value of author is null.");
        }
        this.author = author;
    }

    public Book(String title, String author, BigDecimal price, int page) {
        super(title, price, page);
        this.author = author;
    }

    @Override
    public void buildDisplayLine() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        String outputFormat = "タイトル: 『%s』, 著者名: %s, 価格: %s円, ページ数: %dp, 状態: %s\n";
        System.out.printf(outputFormat, getTitle(), getAuthor(), decimalFormat.format(getPrice()),
                getPage(), getState().getStateInJapanese());
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Book that)) {
            return false;
        }
        return super.equals(that) && Objects.equals(this.author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.author);
    }

    @Override
    public String toString() {
        return String.format("%s, Author: %s", super.toString(), this.author);
    }
}
