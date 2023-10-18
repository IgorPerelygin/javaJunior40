package lesson15;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils{
    @Override
    public void copy(String from, String to) {
        File fileFrom = new File(from);
        File fileTo = new File(to);
        try {
            Files.copy(fileFrom, fileTo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
