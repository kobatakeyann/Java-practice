import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ShowFormattedDate {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of date.");
            return;
        }
        DateTimeFormatter inputPattern = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate inputLocalDate = LocalDate.parse(args[0], inputPattern);
        DateTimeFormatter outputPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(inputLocalDate.format(outputPattern));
    }
}
