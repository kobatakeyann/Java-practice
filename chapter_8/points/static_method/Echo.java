import java.util.Scanner;

class Echo {
    // 一度のランタイムでSCANNERオブジェクトを閉じずに共有する
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // staticメソッドの呼び出し
        String name = Echo.readUserInput("名前");
        String requirement = readUserInput("要件"); // 同クラス内ではメソッド名のみで呼び出せる
        System.out.println("%sさん、こんにちは。ご用件は「%s」ですね。".formatted(name, requirement));
    }

    static String readUserInput(String prompt) {
        System.out.print(prompt + "を入力してください: ");
        String userInput = SCANNER.nextLine();
        return userInput;
    }
}
