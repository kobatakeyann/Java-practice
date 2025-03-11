import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class BigDecimalUse {
    public static void main(String[] args) {
        // BigDecimalインスタンスの生成
        BigDecimal a = BigDecimal.valueOf(234.2324);
        BigDecimal b = new BigDecimal("1.08342");
        // 和積計算
        BigDecimal sum = a.add(b);
        BigDecimal product = a.multiply(b);
        System.out.println("和: %s".formatted(sum));
        System.out.println("積: %s".formatted(product));
        // 商計算(丸め処理)
        final int DECIMAL_PALACES_NUM = 6;
        BigDecimal quotient = a.divide(b, DECIMAL_PALACES_NUM, RoundingMode.HALF_UP);
        System.out.println("商: %s".formatted(quotient));
        // format
        BigDecimal decimalNum = new BigDecimal("13587659");
        DecimalFormat pattern = new DecimalFormat("#,###"); // カンマ区切り
        System.out.println(pattern.format(decimalNum));
    }
}
