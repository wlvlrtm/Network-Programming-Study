package Ex3;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class Example3b {
    public static void receive(InputStream in, byte[] data, int bytesToRead) throws IOException {
        int bytesRead = 0;

        while (bytesRead < bytesToRead) {
            bytesRead += in.read(data, bytesRead, bytesToRead - bytesRead);
        }
    }
    
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        receive(System.in, data, 10);
        System.out.println(Arrays.toString(data));
    }
}