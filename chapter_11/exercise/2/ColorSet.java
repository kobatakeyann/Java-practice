import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ColorSet {
    private static final Set<String> COLORS = new LinkedHashSet<>(
            List.of("Red", "Blue", "White", "Green", "Yellow", "Black", "Cyan"));

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argument of color or 'all'.");
            return;
        }
        if (args[0].equals("all")) {
            for (String color : COLORS) {
                System.out.println(color);
            }
            return;
        }
        String targetColor = args[0];
        String searchResult = (COLORS.contains(targetColor)) ? "存在します" : "存在しません";
        System.out.printf("%s: %s。\n", targetColor, searchResult);
    }
}
