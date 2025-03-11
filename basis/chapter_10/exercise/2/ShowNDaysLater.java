import java.time.LocalDate;

class ShowNDaysLater {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of integer.");
            return;
        }
        int offsetDays = Integer.parseInt(args[0]);
        LocalDate today = LocalDate.now();
        LocalDate shiftedDate = today.plusDays(offsetDays);
        System.out.println(shiftedDate);
    }
}
