package training_text.chapter_4.points.scanner;

import java.util.Scanner;

class ScannerSample {
    public static void main(String[] args) {
        // 標準入力の受け取り
        // try-with-resources文を使ってScanner
        System.out.print("Please input something : ");
        try (Scanner scanner = new Scanner(System.in)) {
            String userInput = scanner.nextLine();
            String message = "Your input : " + userInput;
            System.out.println(message);
        }
    }
}
