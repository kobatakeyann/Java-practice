import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LogTime {
    private static final String LOG_FILEPATH = "log.txt";

    public static void main(String[] args) {
        var dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var now = LocalDateTime.now();
        Path filePath = Path.of(LogTime.LOG_FILEPATH);
        try (var writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
            writer.append(now.format(dateTimeFormat));
            writer.newLine();
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }
    }
}
