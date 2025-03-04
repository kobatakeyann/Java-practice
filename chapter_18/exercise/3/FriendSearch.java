import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class FriendSerach {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please execute with an argumet of text file name.");
            return;
        }
        Path userTextFilePath = Path.of(args[0]);
        HashMap<String, String> addressBook = new HashMap<>();
        try (var reader = Files.newBufferedReader(userTextFilePath)) {
            for (String line; (line = reader.readLine()) != null;) {
                List<String> addressHolder = List.of(line.split(","));
                String emailaddress = addressHolder.get(0);
                String name = addressHolder.get(1);
                addressBook.put(emailaddress, name);
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                boolean isFound = false;
                System.out.print("メールアドレス> ");
                String userInput = scanner.nextLine();
                for (String emailAddress : addressBook.keySet()) {
                    if (!userInput.isEmpty() && emailAddress.contains(userInput)) {
                        System.out.printf("友達ですか？%sさん\n", addressBook.get(emailAddress));
                        isFound = true;
                    }
                }
                if (!isFound) {
                    System.out.println("みつかりません");
                }
                System.out.println("---");
            }
        }
    }
}
