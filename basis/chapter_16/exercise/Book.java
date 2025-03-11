package basis.chapter_16.exercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book extends Publication {
    private final String AUTHOR;

    public Book(String title, String author, BigDecimal price, int page, State state) {
        super(title, price, page, state);
        this.AUTHOR = author;
    }

    public Book(String title, String author, BigDecimal price, int page) {
        super(title, price, page);
        this.AUTHOR = author;
    }

    @Override
    public void buildDisplayLine() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        String outputFormat = "タイトル: 『%s』, 著者名: %s, 価格: %s円, ページ数: %dp, 状態: %s\n";
        System.out.printf(outputFormat, getTitle(), getAuthor(), decimalFormat.format(getPrice()),
                getPage(), getState().getStateInJapanese());
    }

    public String getAuthor() {
        return this.AUTHOR;
    }
}
