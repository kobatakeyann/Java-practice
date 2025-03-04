import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

class FileReading {
    public static void main(String[] args) {
        Path filepath = Path.of("sample.txt");
        try (BufferedReader fr = Files.newBufferedReader(filepath)) {
            for (String line; (line = fr.readLine()) != null;) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }
    }
}
