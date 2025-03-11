import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Datetime {
    public static void main(String[] args) {
        // LocalDateクラス
        LocalDate localDate = LocalDate.of(2023, 11, 7);
        LocalDate today = LocalDate.now();
        System.out.println(localDate);
        System.out.println(today);
        // LocalTimeクラス
        LocalTime localTime = LocalTime.of(23, 50);
        LocalTime currentTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(currentTime);
        // LocalDateTimeクラス
        LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 24, 19, 30);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(currentDateTime);
        // utilメソッド
        System.out.println(currentDateTime.isAfter(localDateTime));
        System.out.println(localDateTime.plusDays(7));
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDate.isLeapYear());
    }
}
