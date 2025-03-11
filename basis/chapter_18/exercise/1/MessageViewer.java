import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

class MessageViewer {
    public static void main(String[] args) {
        String filePath;
        System.out.printf("ファイル名を入力してください> ");
        try (var scanner = new Scanner(System.in)) {
            filePath = scanner.nextLine();
        }
        try (var bf = Files.newBufferedReader(Path.of(filePath))) {
            for (String line; (line = bf.readLine()) != null;) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }
    }
}
