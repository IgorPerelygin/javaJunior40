/*
package lesson15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyWithClassFile implements CopyUtils {

    @Override
    public void copy(String from, String to) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File("destination-path"), StandardCharsets.UTF_8)) {
            Files.readAllLines(Path.of("src/test/resources/source-file.something"), StandardCharsets.UTF_8)
                    .forEach(pw::println);
        }
    }
}*/
