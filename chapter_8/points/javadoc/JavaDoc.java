import java.util.Scanner;

/**
 * 入力内容を受け取り、確認表示するクラス
 */
public class JavaDoc {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = JavaDoc.readUserInput("名前");
        String requirement = JavaDoc.readUserInput("要件");
        System.out.println("%sさん、こんにちは。ご用件は「%s」ですね。".formatted(name, requirement));
    }

    /**
     * ユーザーに向けたプロンプトを表示したうえで、ユーザーからのキーボード入力を受け取る。
     * 
     * @param prompt ユーザーに表示するプロンプト
     * @return キーボード入力された文字列
     */
    public static String readUserInput(String prompt) {
        System.out.print(prompt + "を入力してください: ");
        String userInput = SCANNER.nextLine();
        return userInput;
    }
}
