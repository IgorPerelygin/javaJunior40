package lesson15;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyWithStream implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(to);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
