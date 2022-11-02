package Ex1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Example1a {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstCharacter = 33;
        int lastCharacter = 126;

        for (int ch = firstCharacter; ch <= lastCharacter; ++ch) {
            out.write(ch);
        }
        out.write('\r');
        out.write('\n');
    }


    public static void main(String[] args) throws IOException {
        generateCharacters(System.out);
        generateCharacters(new FileOutputStream("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex1a.txt"));
    }
}
