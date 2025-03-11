import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

class FileWriting {
    public static void main(String[] args) {
        Path filepath = Path.of("sample.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(filepath, StandardOpenOption.APPEND)) {
            writer.newLine();
            writer.append("追記を始めたよ");
            writer.newLine();
            writer.append("追記中だよ");
            writer.newLine();
            writer.append("追記を終わるよ");
            writer.newLine();
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }
    }
}
