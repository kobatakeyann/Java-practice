import java.math.BigDecimal;
import java.math.RoundingMode;

class DecimalCalculation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please execute with 2 arguments of float");
            return;
        }
        BigDecimal a = new BigDecimal(args[0]);
        BigDecimal b = new BigDecimal(args[1]);
        BigDecimal product = a.multiply(b);
        final int DECIMAL_PLACES_NUM = 10;
        BigDecimal quotient = a.divide(b, DECIMAL_PLACES_NUM, RoundingMode.DOWN);
        System.out.println("積は %s".formatted(product));
        System.out.println("商は %s".formatted(quotient));
    }
}
