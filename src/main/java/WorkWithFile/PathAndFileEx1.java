package WorkWithFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFileEx1 {
    public static void main (String[] args) throws IOException {
        Path filePath = Paths.get("test1.txt");
        Path directoryPath = Paths.get("C:\\Users\\pyatukhova\\Desktop\\m");
        Path directoryPath2 = Paths.get("C:\\Users\\pyatukhova\\Desktop\\b");

        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());

//        System.out.println(filePath.resolve(directoryPath));
//        System.out.println(directoryPath.resolve(filePath));

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }
        if(!Files.exists(directoryPath2)){
            Files.createDirectory(directoryPath2);
        }

//        System.out.println(Files.readAttributes(filePath, "*"));
//
//        Files.copy(filePath, directoryPath.resolve("test15.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directoryPath, directoryPath2.resolve("m"));

//        Files.move(filePath, directoryPath2.resolve("test1"));

//        Files.move(Paths.get("text.txt"), (Paths.get("text1.txt")));
//        Files.delete(Paths.get("test1.txt"));


    }
}
