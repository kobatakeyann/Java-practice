package chapter_15.exercise;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Magazine extends Publication {
    private final String PUBLISHER;
    private final LocalDate PUBLICATION_DATE;
    private final int VOLUME, NUMBER;

    public Magazine(String title, BigDecimal price, int page, String publisher,
            LocalDate publicationDate, int volume, int number) {
        super(title, price, page);
        this.PUBLISHER = publisher;
        this.PUBLICATION_DATE = publicationDate;
        this.VOLUME = volume;
        this.NUMBER = number;
    }

    public String getPublisher() {
        return this.PUBLISHER;
    }

    public LocalDate getPublicationDate() {
        return this.PUBLICATION_DATE;
    }

    public int getVolume() {
        return this.VOLUME;
    }

    public int getNumber() {
        return this.NUMBER;
    }

    @Override
    public void buildDisplayLine() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String price = decimalFormat.format(getPrice());
        String publicationDate = getPublicationDate().format(dateFormat);
        String outputFormat = "タイトル: 『%s』, 出版社: %s, 価格: %s円, ページ数: %dp\n発行日: %s, 巻: %d, 号: %d\n";
        System.out.printf(outputFormat, getTitle(), getPublisher(), price, getPage(),
                publicationDate, getVolume(), getNumber());
    }
}
