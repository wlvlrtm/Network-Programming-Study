package Ex1;
import java.io.OutputStream;
import java.io.IOException;


public class Example1e {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int lastPrintableCharacter = 126;

        for (int character = firstPrintableCharacter; character <= lastPrintableCharacter; ++character) {
            out.write(character);
        }

        //out.write('\r');
        //out.write('\n');

        out.close();
    }
     
    public static void main(String[] args) throws IOException {
        generateCharacters(System.out);
    }
}