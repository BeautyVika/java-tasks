package WorkWithFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFileEx2 {
    public static void main (String[] args) throws IOException {
        Path filePath = Paths.get("test1.txt");
//        Files.createFile(filePath);
//        String dialog = "Hello!\nHow are you?\nOk";
//        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for(String l: list) {
            System.out.println(l);
        }
    }
}
