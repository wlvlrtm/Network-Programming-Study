package Ex1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example1b {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstCharacter = 33;
        int lastCharacter = 126;
        int size = (lastCharacter - firstCharacter + 1) + 2;
        int index = 0;
        byte[] data = new byte[size];
        
        for (int ch = firstCharacter; ch <= lastCharacter; ++ch) {
            data[index++] = (byte)ch;
        }

        data[index++] = '\r';
        data[index++] = '\n';

        out.write(data);
    }


    public static void main(String[] args) throws IOException {
        generateCharacters(System.out); // Console
        generateCharacters(new FileOutputStream("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex1b.txt"));  // File
    }
}
