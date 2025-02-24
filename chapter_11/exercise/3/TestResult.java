import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class TestResult {
    private static final List<String> SUBJECTS = List.of("Japanese", "English", "Math");

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (String subject : SUBJECTS) {
                System.out.print(subject + "の点数を入力 > ");
                Integer score = scanner.nextInt();
                scores.put(subject, score);
            }
        }
        for (String subject : SUBJECTS) {
            Integer score = scores.get(subject);
            System.out.printf("科目: %-8s  点数: %3d\n", subject, score);
        }
    }
}
