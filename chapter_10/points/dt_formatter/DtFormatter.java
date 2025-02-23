import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DtFormatter {
    public static void main(String[] args) {
        // LocalDateTimeのformat
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(formatter);
        System.out.println(now);
        System.out.println(formattedDateTime);
        // formatを用いた文字列からLocalDateTimeへの変換
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse("2024/12/24 19:30", pattern);
        System.out.println(dateTime);
    }
}
