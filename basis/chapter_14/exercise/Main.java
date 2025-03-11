package basis.chapter_14.exercise;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        Book book2 = new Book("破戒", "島崎藤村", BigDecimal.valueOf(2000), 512);
        Book book3 = new Book("羅生門", "芥川龍之介", BigDecimal.valueOf(407), 216);
        Book book4 = new Book("走れメロス", "太宰治", BigDecimal.valueOf(400), 304);
        Book book5 = new Book("雪国", "川端康成", BigDecimal.valueOf(277), 208);
        Library library = new Library();
        System.out.println("Library内の一覧");
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.displayAll();
        System.out.println("---");
        library.findAndShow("走れメ");
        System.out.println("---");
        library.findAndShow("人間失格");
    }
}
