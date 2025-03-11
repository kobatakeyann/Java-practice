import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LeapYearDetector {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute eith an argument of date");
            return;
        }
        DateTimeFormatter inputPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDate = LocalDate.parse(args[0], inputPattern);
        boolean isLeapYear = inputDate.isLeapYear();
        System.out.println(isLeapYear);
    }
}
