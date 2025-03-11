package basis.chapter_15.exercise;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Bookインスタンス
        Publication book1 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        Publication book2 = new Book("破戒", "島崎藤村", BigDecimal.valueOf(2000), 512);
        Publication book3 = new Book("羅生門", "芥川龍之介", BigDecimal.valueOf(407), 216);
        // Magazineインスタンス
        Publication magazine1 = new Magazine("PRESIDENT", BigDecimal.valueOf(110), 216, "プレジデント社",
                LocalDate.of(2024, 12, 18), 62, 16);
        Publication magazine2 = new Magazine("Newton", BigDecimal.valueOf(1190), 133, "ニュートンプレス",
                LocalDate.of(1990, 9, 18), 44, 8);
        Library library = new Library();
        System.out.println("Library内の一覧");
        library.add(book1);
        library.add(book2);
        library.add(magazine1);
        library.add(book3);
        library.add(magazine2);
        library.displayAll();
    }
}
