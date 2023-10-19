package lesson15;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyWithClassFile implements CopyUtils {

    @Override
    public void copy(String from, String to) throws IOException {
        Files.copy(Paths.get(from),
                Paths.get(to), StandardCopyOption.REPLACE_EXISTING);
    }
}
