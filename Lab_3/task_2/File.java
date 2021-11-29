package task_2;
import java.io.Closeable;
import java.io.IOException;

public class File implements Closeable{

    public void readlines() throws IOException{
        if(true) {
            throw new IOException("IOException!");
        }
    }

    @Override
    public void close()  {
        System.out.println("File is closed!");
    }
}
