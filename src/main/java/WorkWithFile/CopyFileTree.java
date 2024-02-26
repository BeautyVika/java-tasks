package WorkWithFile;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main (String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\pyatukhova\\Desktop\\x");
        Path destination = Paths.get("C:\\Users\\pyatukhova\\Desktop\\copyHere");

        Files.walkFileTree(source, new MyFileVisit(source, destination));
    }
}

@Getter
@AllArgsConstructor
class MyFileVisit extends SimpleFileVisitor<Path>{
    private Path source;
    private Path destination;

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
       Path newDestination = destination.resolve(source.relativize(dir));
       Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}