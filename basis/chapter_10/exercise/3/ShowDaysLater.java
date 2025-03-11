import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ShowDaysLater {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of integer.");
            return;
        }
        int offsetDays = Integer.parseInt(args[0]);
        LocalDate today = LocalDate.now();
        LocalDate shiftedDate = today.plusDays(offsetDays);
        DateTimeFormatter outputPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String formattedToday = today.format(outputPattern);
        String formattedShiftedDate = shiftedDate.format(outputPattern);
        System.out.println("今日は %s です。".formatted(formattedToday));
        System.out.println(
                "%s の %d 日後は %s です。".formatted(formattedToday, offsetDays, formattedShiftedDate));
    }
}
