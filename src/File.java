import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class MyFile extends InputStream {
    private FileInputStream inputStream;

    public MyFile(String fileName) throws IOException {
        this.inputStream = new FileInputStream(fileName);
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }
}

