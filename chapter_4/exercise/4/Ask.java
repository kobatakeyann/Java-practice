import java.util.Scanner;

class Ask {
    public static void main(String[] args) {
        System.out.print("ご用件は何でしょうか？ > ");
        try (Scanner scanner = new Scanner(System.in)) {
            String prompt = scanner.nextLine();
            String message = "ご用件は \"" + prompt + "\" ですね。";
            System.out.println(message);
        }
    }
}
