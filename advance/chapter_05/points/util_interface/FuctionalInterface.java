import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

class FunctionalInterface {
    public static void main(String[] args) {
        // Function interface (関数)
        Function<BigDecimal, String> priceFormatter = (price) -> {
            DecimalFormat ft = new DecimalFormat("#,###");
            return "￥" + ft.format(price);
        };
        String formattedPrice = priceFormatter.apply(BigDecimal.valueOf(2640));
        System.out.println(formattedPrice);
        // Predicate interface (真偽値を返す)
        Predicate<String> isLongLength = (s) -> s.length() > 15;
        System.out.println(isLongLength.test("short_word"));
        // Consumer interface (戻り値なし)
        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("Consumer interface is used for function with no return.");
        // primitive interface (プリミティブ型のインターフェース)
        IntPredicate isOdd = (num) -> num % 2 != 0;
        System.out.println(isOdd.test(3));
    }
}
