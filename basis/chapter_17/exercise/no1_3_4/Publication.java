package basis.chapter_17.exercise.no1_3_4;

import java.math.BigDecimal;

abstract class Publication {
    private final String TITLE;
    private final BigDecimal PRICE;
    private final int PAGE;
    private State state;

    public Publication(String title, BigDecimal price, int page, State state) {
        if (title == null || price == null) {
            throw new IllegalArgumentException("Given values contain null at least one.");
        }
        boolean isNegativePrice = price.compareTo(BigDecimal.ZERO) == -1;
        if (isNegativePrice || page < 0) {
            throw new IllegalArgumentException("Price or page has negative value.");
        }
        this.TITLE = title;
        this.PRICE = price;
        this.PAGE = page;
        this.state = state;
    }

    public Publication(String title, BigDecimal price, int page) {
        this(title, price, page, State.AVAILABLE);
    }

    public void checkOut() {
        this.state = State.CHECKED_OUT;
    }

    public void checkIn() {
        this.state = State.AVAILABLE;
    }

    public void deaccession() {
        this.state = State.DEACCESSIONED;
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

    public State getState() {
        return this.state;
    }

    public abstract void buildDisplayLine();
}
