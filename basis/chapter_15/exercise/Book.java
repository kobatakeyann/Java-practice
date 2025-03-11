package basis.chapter_15.exercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book extends Publication {
    private final String AUTHOR;

    public Book(String title, String author, BigDecimal price, int page) {
        super(title, price, page);
        this.AUTHOR = author;
    }

    @Override
    public void buildDisplayLine() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        String outputFormat = "タイトル: 『%s』, 著者名: %s, 価格: %s円, ページ数: %dp\n";
        System.out.printf(outputFormat, getTitle(), getAuthor(), decimalFormat.format(getPrice()),
                getPage());
    }

    public String getAuthor() {
        return this.AUTHOR;
    }
}
