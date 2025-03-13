package advance.chapter_01.exercise;

import java.math.BigDecimal;
import java.util.Objects;

abstract class Publication {
    private String title;
    private BigDecimal price;
    private int page;
    private State state;

    public Publication(String title, BigDecimal price, int page, State state) {
        if (title == null || price == null) {
            throw new IllegalArgumentException("Given values contain null at least one.");
        }
        boolean isNegativePrice = price.compareTo(BigDecimal.ZERO) == -1;
        if (isNegativePrice || page < 0) {
            throw new IllegalArgumentException("Price or page has negative value.");
        }
        this.title = title;
        this.price = price;
        this.page = page;
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
        return this.title;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public int getPage() {
        return this.page;
    }

    public State getState() {
        return this.state;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public abstract void buildDisplayLine();

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Publication that)) {
            return false;
        }
        return Objects.equals(this.page, that.page) && Objects.equals(this.page, that.page)
                && Objects.equals(this.title, that.title) && Objects.equals(this.price, that.price)
                && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.page, this.price, this.title, this.state);
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Price: %s円, Page: %dページ, State: %s", this.title,
                this.price, this.page, this.state);
    }
}
