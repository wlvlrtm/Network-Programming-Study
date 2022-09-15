package Ex1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example1b {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int lastPrintableCharacter = 126;
        int size = (lastPrintableCharacter - firstPrintableCharacter + 1) + 2;  // first ~ last + CF/LF (2)
        int index = 0;
        byte[] arr = new byte[size];    // ASCII Array
        
        for (int character = firstPrintableCharacter; character <= lastPrintableCharacter; ++character) {
            arr[index++] = (byte)character;
        }

        arr[index++] = '\r';    // CR
        arr[index++] = '\n';    // LF
        
        out.write(arr);
    }

    public static void main(String[] args) throws IOException {
        generateCharacters(System.out); // Console
        generateCharacters(new FileOutputStream("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex1b.txt"));  // File
    }
}
