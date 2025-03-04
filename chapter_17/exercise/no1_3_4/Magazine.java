package chapter_17.exercise.no1_3_4;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Magazine extends Publication {
    private final String PUBLISHER;
    private final LocalDate PUBLICATION_DATE;
    private final Integer VOLUME, NUMBER;

    public Magazine(String title, BigDecimal price, Integer page, String publisher,
            LocalDate publicationDate, Integer volume, Integer number) {
        super(title, price, page);
        if (publisher == null || publicationDate == null || volume == null || number == null) {
            throw new IllegalArgumentException("Given values contain null at least one.");
        }
        if (volume < 0 && number < 0) {
            throw new IllegalArgumentException("volume or number has negative value.");
        }
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

    public Integer getVolume() {
        return this.VOLUME;
    }

    public Integer getNumber() {
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
