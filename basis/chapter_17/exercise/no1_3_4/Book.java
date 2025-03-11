package basis.chapter_17.exercise.no1_3_4;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Book extends Publication {
    private final String AUTHOR;

    public Book(String title, String author, BigDecimal price, int page, State state) {
        super(title, price, page, state);
        if (author == null) {
            throw new IllegalArgumentException("Value of author is null.");
        }
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
