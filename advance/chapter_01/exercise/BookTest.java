package advance.chapter_01.exercise;

import java.math.BigDecimal;

public class BookTest {
    public static void main(String[] args) {
        // test1
        Publication book1 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        System.out.println(book1.toString());
        // test2
        Publication book2 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(396), 335);
        System.out.println(book2.equals(book1));
        // test3
        Publication book3 = new Book("羅生門", "夏目漱石", BigDecimal.valueOf(396), 335);
        System.out.println(book3.equals(book1));
        // test4
        Publication book4 = new Book("こころ", "芥川龍之介", BigDecimal.valueOf(396), 335);
        System.out.println(book4.equals(book1));
        // test5
        Publication book5 = new Book("こころ", "夏目漱石", BigDecimal.valueOf(4000), 335);
        System.out.println(book5.equals(book1));
        // test6
        String testString = "test";
        System.out.println(book1.equals(testString));
    }
}
