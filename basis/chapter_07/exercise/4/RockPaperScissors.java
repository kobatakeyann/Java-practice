import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        final Map<String, String> JYANKEN_MAP = Map.of("R", "グー", "P", "パー", "S", "チョキ");
        final List<String> CHOICES = List.of("R", "P", "S");
        Random random = new Random();
        boolean isFinished = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while (!isFinished) {
                System.out.print("グー(R), パー(P), チョキ(S) > ");
                String userChoice = scanner.nextLine().toUpperCase();
                if (!JYANKEN_MAP.containsKey(userChoice)) {
                    System.out.println("Invalid input. Please choose from ('R', 'P', 'S').");
                    continue;
                }
                String computerChoice = CHOICES.get(random.nextInt(3));
                System.out.println("コンピューター: " + JYANKEN_MAP.get(computerChoice));
                String result;
                if (userChoice.equals(computerChoice)) {
                    result = "あいこ";
                } else {
                    isFinished = true;
                    result = switch (userChoice + computerChoice) {
                        case "RS", "SP", "PR" -> "あなたの勝ち";
                        default -> "あなたの負け";
                    };
                }
                System.out.println("結果: " + result);
            }
        }
    }
}
