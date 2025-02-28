package chapter_15.exercise;

import java.math.BigDecimal;

abstract class Publication {
    private final String TITLE;
    private final BigDecimal PRICE;
    private final int PAGE;

    public Publication(String title, BigDecimal price, int page) {
        this.TITLE = title;
        this.PRICE = price;
        this.PAGE = page;
    }

    public String getTitle() {
        return this.TITLE;
    }

    public BigDecimal getPrice() {
        return this.PRICE;
    }

    public int getPage() {
        return this.PAGE;
    }

    public abstract void buildDisplayLine();
}
