package Ex3;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3a {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.in.read(data, 0, 10);
        System.out.println(Arrays.toString(data));
    }
}