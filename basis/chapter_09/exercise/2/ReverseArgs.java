import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments received.");
            return;
        }
        List<String> argsList = Arrays.asList(args);
        Collections.reverse(argsList);
        System.out.println(String.join(" ", argsList));
    }
}
