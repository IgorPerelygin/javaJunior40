package lesson17.threads;

import lesson15.CopyUtils;
import lesson15.CopyWithCommonIo;

import javax.imageio.IIOException;
import java.io.IOException;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask{
    private CopyUtils copyUtils = new CopyWithCommonIo();
    private String from;
    private String to;

    public CopyFileTaskImpl(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void setFileCopyUtils(CopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copy(from, to);
        }catch (IOException e){
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "CopyFileTaskImpl{" +
                " copyUtils =" + copyUtils +
                ", from = '" + from + '\'' +
                ", to = '" + to + '\'' +
                '}';
    }
}
