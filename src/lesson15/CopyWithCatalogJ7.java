package lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyWithCatalogJ7 implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        Path file = Path.of(from);
        Path go = Path.of(to);
        Files.copy(file, go);
    }
}
