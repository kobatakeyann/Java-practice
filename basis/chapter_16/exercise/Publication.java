package basis.chapter_16.exercise;

import java.math.BigDecimal;

abstract class Publication {
    private final String TITLE;
    private final BigDecimal PRICE;
    private final int PAGE;
    private State state;

    public Publication(String title, BigDecimal price, int page, State state) {
        this.TITLE = title;
        this.PRICE = price;
        this.PAGE = page;
        this.state = state;
    }

    public Publication(String title, BigDecimal price, int page) {
        this(title, price, page, State.AVAILABLE);
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

    public void setState(State state) {
        this.state = state;
    }

    public abstract void buildDisplayLine();
}
