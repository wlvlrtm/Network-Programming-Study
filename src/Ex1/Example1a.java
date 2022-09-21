package Ex1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Example1a {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int lastPrintableCharacter = 126;        
        
        for (int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch) {
            out.write(ch);  // 33 ~ 126
        }

        out.write('\n');    // CR
        out.write('\r');    // LF
    }
    
    
    public static void main(String[] args) throws IOException {
        generateCharacters(System.out); // Console
        generateCharacters(new FileOutputStream("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex1b.txt"));   // File
    }
}
