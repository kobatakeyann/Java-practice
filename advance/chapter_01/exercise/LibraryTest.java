package advance.chapter_01.exercise;

import java.math.BigDecimal;

public class LibraryTest {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();
        Book book1 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        Book book2 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        library1.add(book1);
        library2.add(book2);
        // test4
        System.out.println(library1.equals(library2));
        // test5
        book2.setTitle("斜陽");
        System.out.println(library1.equals(library2));
        // test6
        book2.setTitle("こころ");
        book2.setAuthor("芥川龍之介");
        System.out.println(library1.equals(library2));
        // test7
        book2.setAuthor("夏目漱石");
        book2.setPrice(BigDecimal.valueOf(1000));
        System.out.println(library1.equals(library2));
    }
}
