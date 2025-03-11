import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueElement {
    public static void main(String[] args) {
        Set<String> inputSet = new HashSet<>();
        final int INPUT_TIMES = 5;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < INPUT_TIMES; i++) {
                System.out.print("集合の要素を入力 > ");
                inputSet.add(scanner.nextLine());
            }
        }
        int uniqueElementNum = inputSet.size();
        System.out.println("入力された要素は%dつです。".formatted(uniqueElementNum));
    }
}
