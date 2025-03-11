import java.util.Scanner;

class CountEnglishWords {
    public static void main(String[] args) {
        System.out.print("入力してください > ");
        String[] words;
        try (Scanner scanner = new Scanner(System.in)) {
            String sentence = scanner.nextLine();
            words = sentence.split(" ");
        }
        int wordsNum = words.length;
        System.out.println("単語数: " + wordsNum);
    }
}
