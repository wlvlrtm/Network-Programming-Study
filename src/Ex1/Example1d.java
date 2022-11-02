package Ex1;
import java.io.OutputStream;
import java.io.IOException;


public class Example1d {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstCharacter = 33;
        int lastCharacter = 126;

        for (int ch = firstCharacter; ch <= lastCharacter; ++ch) {
            out.write(ch);
        }
        
        out.flush();
    }
     
    public static void main(String[] args) throws IOException {
        generateCharacters(System.out);
    }
}